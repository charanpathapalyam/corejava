package oops.inheritance;

public class Child2 extends Parent                  // BY USING [extends] WE ARE CALLING THE COMMAND DIRECTLY FROM PARENT PACKAGE
{
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		
		c2.surname();                                           // this [surname] should be called from parent package
		
		c2.asserts();                                          // this [asserts] should be called from parent package
		
	}
	

}
