package com.example;

import java.io.IOException;
import java.io.ByteArrayOutputStream;
import com.example.data.Grape;
import com.example.data.GrapeChanged;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectMapperExample {
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    // Converting from Json to Java
    Grape grape = mapper.readValue("{\"wrangled\":\"false\"}", Grape.class);    

    System.out.println(grape.toString());

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    // Converting from Java to Json
    mapper.writeValue(output, grape);

    System.out.println(output.toString());


    //Grape grapeFail = mapper.readValue("{\"wrangled\":\"false\", \"break\":\"yay!\"}", Grape.class);

    GrapeChanged grapeChanged = mapper.readValue("{\"wrangled\":\"false\"}", GrapeChanged.class);

    System.out.println(output.toString());
  }
}