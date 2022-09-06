package oops.abstraction;


abstract class A                                    // we can't create object for abstract class 
{
	
	public String name = "abc";
	
	abstract public void test();
	public void test1()
	{
		System.out.println("test1");
	}
	public A()
	{
		
	}
}

public class Example1 extends A
{
	public static void main(String[] args) {
		A a= new Example1();  // this method is CALLED [AUTO UPCASTING]                // creating object for normal class      
		a.test1();                                   // creating reference for the abstract class
		a.test();
		
	}
	public void test()                                        //this is  method overriding 
	{
		System.out.println("test");
	}
}





