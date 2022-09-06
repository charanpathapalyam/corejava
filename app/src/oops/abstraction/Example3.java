package oops.abstraction;


abstract class C1
    {
	public abstract void test1();
    }

	abstract class C2 extends C1
	{
		public abstract void test2();	
	}
	
	
	abstract class C3 extends C2
	
	{
		
		public abstract void test3();                // this all known as multilevel inheritance 
	}
	

public class Example3 extends C1

{
	public void test1()
	{
		
	}

	public void test2()
	{	
		
    }
}