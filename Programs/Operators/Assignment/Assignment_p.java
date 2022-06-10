package Anudip_programe;

import java.util.Scanner;

public class Assignment_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
		  
          System.out.println(" Enter the value of num1 = ");
          int num1 = sc.nextInt();
          
          System.out.println(" Enter the value of num2 = ");
		  int num2 =sc.nextInt();
		  
	        // Adding & Assigning values
	        num1 += num2;
	 
	        // Displaying the assigned values
	        System.out.println("num1 = " + num1);
	}

}
