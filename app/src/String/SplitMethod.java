package String;

public class SplitMethod {
	
public static void main(String[] args) {
	String cities = "chittoor#hyderabad#banglore#andhra";
	
	String cs[] = cities.split("#");
	System.out.println(cs[0]);
	System.out.println(cs[2]);
	
	for (int i=0; i<cs.length; i++)                        // this is known as forloop
	{
		if (cs[i].startsWith("c"))                         // this method is known as boolean method
		System.out.println(cs[i]);
	}
	
	

	String values = "500/9590/8851/885122/5426";                // this is an example for [ splitmethod ] in numbers
	
	String vlu[] = values.split("/");
	
	System.out.println(vlu[0]);
	
	System.out.println(vlu[2]);
	
	
	    for (int c=0 ; c<vlu.length; c++)                           // this is known as forloop
	{
	    	if (vlu[c].startsWith("5"))                             // this method is known as boolean method
		    if (vlu[c].endsWith("0"))
		System.out.println(vlu[c]);
	}	
}
}
