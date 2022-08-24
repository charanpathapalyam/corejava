package app3;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name ");
		String  firstname = sc. nextLine();
		
		
		System.out.println("enter second name ");
		String  secondname = sc. nextLine();
		
		String fullname = firstname+" "+secondname;
		System.out.println(fullname);
	}
	

}
