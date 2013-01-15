public class MyClass {
	private String privateString = "Private";
	public String publicString = "Public";

	public void myMethod() {
		String innerString = "Method";

		{
			String standAlone = "Stand Alone";
		}
	}
}