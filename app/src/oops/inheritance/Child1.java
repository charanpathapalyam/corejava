package oops.inheritance;

public class Child1 extends Parent         // BY USING [extends] WE ARE CALLING THE COMMAND DIRECTLY FROM PARENT PACKAGE 
{
public static void main(String[] args) {
	
	Child1 c = new Child1();
	
	c.surname();                                // this [surname] should be called from parent package 
	
	c.asserts();                                 // this [asserts] should be called from parent package
	
   }
}
