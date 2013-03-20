package com.awesome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
    public static void main(String [] args) throws Exception {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.getConnection("jdbc:h2:mem:db1;DB_CLOSE_DELAY=-1;MVCC=TRUE");

        createTables(conn);

        createGrape(conn, 1, true);
        createGrape(conn, 2, false);
        createGrape(conn, 3, true);


        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT id from grape where wrangled = true");

        while (rs.next()) {
            System.out.println("Grape found: " + rs.getInt(1));
        }

        rs.close();

        statement.close();

        conn.close();
    }

    private static boolean createTables(Connection conn) throws Exception {
        Statement statement = conn.createStatement();

        try {
            int result = statement.executeUpdate("CREATE TABLE grape ( id INTEGER IDENTITY, wrangled BOOLEAN)");

            if (result == -1) {
                System.err.println("Database error!");
                return false;
            }
        } finally {
            statement.close();
        }

        return true;
    }

    private static boolean createGrape(Connection conn, int id, boolean wrangled) throws Exception {
        Statement statement = conn.createStatement();

        try {
            int result = statement.executeUpdate("INSERT INTO grape(id, wrangled) VALUES (" + id + ", " + wrangled + ")");

            if (result == -1) {
                System.err.println("Database error!");
                return false;
            }
        } finally {
            statement.close();
        }

        System.out.println("Created grape: " + id + ", " + wrangled);

        return true;
    }
}
