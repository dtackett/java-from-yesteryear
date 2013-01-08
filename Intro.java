public class Intro {
  public static void main(String [] args) {
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 9223372036854775807L;
    float myFloat = 0.0f;
    double myDouble = 0.0;
    char myChar = 'A';
    boolean myBoolean = false;
    String myString = "Hi there";
    CustomObject myObject = new CustomObject();

    System.out.println(myByte);
    System.out.println(myShort);
    System.out.println(myInt);
    System.out.println(myLong);
    System.out.println(myFloat);
    System.out.println(myDouble);
    System.out.println(myChar);
    System.out.println(myBoolean);
    System.out.println(myString);
    System.out.println(myObject);
  }
}