package String;

public class Example {
public static void main(String[] args) {
	String str = "abc";
	String str1 = "ABC";
	
	
	boolean b = str.equals(str1);                       // equals method will checks with the cases
	System.out.println(b);
	
	
	boolean b1= str.equalsIgnoreCase(str1);
	System.out.println(b1);
	
}
}
