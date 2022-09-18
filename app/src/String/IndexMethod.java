package String;

public class IndexMethod {
public static void main(String[] args) {
	String str = "abcaef";
	char s = str.charAt(1);
	System.out.println(s);
	
	int i = str.indexOf('a');                                    // this is [ index ] method 
	System.out.println(i);
	
	int j = str.lastIndexOf('a');                                // this is [ lastindex ] method
	System.out.println(j);
	
}
}
