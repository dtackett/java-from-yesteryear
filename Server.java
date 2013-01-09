import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;

public class Server {
	public static void main(String[] args) {
		ServerSocket server;
		Socket socket;
		OutputStream stream;


		try {
			server = new ServerSocket(8080);

			System.out.println("Waiting for a connection...");
			socket = server.accept();

			stream = socket.getOutputStream();

			stream.write("HTTP/1.0 200 OK\n\n<html><body>Hi!</body></html>".getBytes());

			System.out.println("...done responded.");
		} catch (Exception ex) {
			System.out.println("Something blew up!");
		}
	}
}