package String;

public class ContainsMethod {
public static void main(String[] args) {
	String c = "Bangalore";
	
	
	boolean i = c.contains("a");
	System.out.println(i);                   // output [ TRUE ]
	
	boolean a = c.contains("Bang");
	System.out.println(a);                    // we can check by using the wards are present are not in string
	
	
	
	boolean j = c.contains("i");              // output [ false ]
	System.out.println(j);
}
}
