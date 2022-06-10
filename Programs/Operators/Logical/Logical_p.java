package Anudip_programe;

import java.util.Scanner;

public class Logical_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A = ");
		int a =sc.nextInt();
		
		System.out.println("Enter the value B = ");
		int b = sc.nextInt();
		
		System.out.println("Enter the value C = ");
		int c = sc.nextInt();
		
		int d = 0;
 
        // using logical AND to verify
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
	}

}
