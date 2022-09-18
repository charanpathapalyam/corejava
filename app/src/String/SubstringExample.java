package String;

public class SubstringExample {
	public static void main(String[] args) {
		String str = "BangaloreHyderabad";                          //substring example with alphabets
		String s = str.substring(7,11);
		
				System.out.println(s);
				
				String s1 = str.substring(0,4);
				System.out.println(s1);
				
				String s2 = str.substring(4,8);
				System.out.println(s2);
				
				String s3 = str.substring(8,13);
				System.out.println(s3);
				
				
				
		 String java = "12345678910111213";                 // substring example with numbers 
		 String j = java.substring(0);
		 System.out.println(j);
		
		 String j1 = java.substring(3,13);
		 System.out.println(j1);
						
	
						
	String charan = "123456abgcdrf";                 // substring example with numbers and alphabets
	String c1 = charan.substring(3,11);
	System.out.println(c1);
	
	String c2 = charan.substring(4,13);
	System.out.println(c2);	
						
						
	}
}
