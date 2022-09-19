package String;

public class Example5 {
public static void main(String[] args) {
	String s = "charan";
	String s1 = new String("charan");
	
	System.out.println(s.equals(s1));                // equals method checks with the content 
	                                                 //object creation with string literal way
	
	System.out.println(s == s1);                    // equaloperator method checks with the objects  
	                                                //object creation using new keyword
	
	
	
	
	
	String c = "charan";
	String c1 = "ChArAn";
	
	System.out.println(c.equals(c1));
	
	System.out.println(c == c1);
	
}
}
