public class ExceptionExample {  

  public static void main(String[] args) {
    // Checked
    // didSomethingBadHappen();

    try {
      didSomethingBadHappen();
    } catch (Exception ex) {
      System.err.println("Error");
      ex.printStackTrace();
    }

    // Runtime
    String myString = null;

    // myString = "Hey there!";

    System.out.println(myString.toString());
  }

  public static void didSomethingBadHappen() throws Exception {
    throw new Exception("Somethind bad happened!");
  }
}