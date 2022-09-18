package String;

public class BooleanExamples {
public static void main(String[] args) {
	

String values = "500/9590/8851/885122/5426";                // this is an example for [ splitmethod ] in numbers
	
	String vlu[] = values.split("/");
	
	System.out.println(vlu[0]);
	
	System.out.println(vlu[2]);
	

	    for (int c=0 ; c<vlu.length; c++)                 // this is known as forloop
	{
	    	if (vlu[c].startsWith("5"))                             // this method is known as boolean method
		    if (vlu[c].endsWith("0"))
		System.out.println(vlu[c]);
	}	
}

}






//      if (vlu[c].startsWith("5"))          [ startswith ]  this is known as boolean meathod 
	
	
//   	if (vlu[c].endsWith("0"))             [ endswith ]  this is known as boolean meathod