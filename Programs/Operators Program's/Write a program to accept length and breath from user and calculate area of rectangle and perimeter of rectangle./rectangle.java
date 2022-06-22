
package Anudip_programe;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		
		//Write a program to accept length and breath from user and calculate area of rectangle and perimeter of rectangle.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Value of Length = ");
		int l = sc.nextInt();
		
		System.out.print("Enter the breath = ");
		int b = sc.nextInt();
  
        int area = l*b;
        System.out.println("The Area of Rectangle = "+area);
        
        int perimeter = 2*(l+b);
        System.out.println("The perimeter of Rectangle = "+perimeter);
	}

}
