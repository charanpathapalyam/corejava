
package app3;


import java.util.Scanner;

public class SimpleIntrest {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter price ");
	int p = sc.nextInt();
	
	System.out.println("enter time(in months)");
	int t  = sc.nextInt();
	
	System.out.println("Enter rate of intrest");
	double r = sc.nextDouble();
	
	double si = (p*t*r)/100;
	
	System.out.println(si);
	
   }
}
