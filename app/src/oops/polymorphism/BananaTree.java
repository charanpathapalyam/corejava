package oops.polymorphism;


class Tree                                                      // This is one class
{
	public void mangos()
	{
 System.out.println("green mangos");
	}
}
	

 public class BananaTree extends Tree                        // This is another class
                                                             //this is overriding  of oops.polymorphism
{
	public void mangos1()
	{
		System.out.println("yellow mangos");
		
	}
				
public static void main(String[] args) {
	
	
		BananaTree b = new BananaTree();                       // we are creating reference for  [BananaTree] class
		b.mangos1();
		
		
	   Tree c = new Tree();                                  // we are creating reference for  [Tree] class
       c.mangos();
       
       
//	Tree t = new BananaTree();                           // THIS is AUTO UPCASTING
 //      t.mangos();
}


}
	

