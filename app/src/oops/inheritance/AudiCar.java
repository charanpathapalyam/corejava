package oops.inheritance;

public class AudiCar extends Car{
public static void main(String[] args) {
		
		AudiCar audiCar = new AudiCar();
		
		audiCar.wheels();
		audiCar.doors();
	}

   public void wheels()      //this is known as over riding method
{
	System.out.println("audicar wheels");
	
}
public void doors()
{
	System.out.println("audicar doors");
}
}
 
