package oops.polymorphism;
 
class Parent                                                         // this is also an class 
{
	public void test1(int i)
	{
		System.out.println("Parent");
	}
	 
}
 public class MethodOverridingExample extends Parent{                // if we use methodoverriding concept we need to [extends]
	 
	                                                                 // this is also an another class  both are in same package 

	 
	 
	 public void test2(int i)
	 {
		 System.out.println("student");
	 }
	 
	 
	 public static void main(String[] args) {
		 
   MethodOverridingExample c = new MethodOverridingExample();       // we are creating  object for  [MethodOverridingExample class]
		
		 c.test2(3);                                                // we are creating reference for  [test1]the non static 
		 
		 
		 Parent p = new Parent();                                   // we are creating  object for [Parent class]    
		 
		 p.test1(5);                                                 // we can give any value for  integer 
	}
 }

  