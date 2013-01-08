import java.net.URISyntaxException;
import java.net.URI;

public class ExceptionExample {  

  public static void main(String[] args) {
    // Checked
    //URI myURI = new URI("http://www.google.com");

    try {
      URI myURI = new URI("http://www.google.com fail!");
    } catch (URISyntaxException ex) {
      System.err.println("Invalid URI Syntax! ");
      ex.printStackTrace();
    }

    // Runtime
    String myString = null;

    // myString = "Hey there!";

    System.out.println(myString.toString());
  }
}