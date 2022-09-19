package String;

public class ConcatMethod {
	public static void main(String[] args) {
		String cname= "abc";
		String rname= "ABC";
		String name = cname.concat(",").concat(rname);           //(",") if we need we can keep space are name symbols in between 
		System.out.println(name);
	}

}
