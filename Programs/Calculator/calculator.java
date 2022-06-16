package Anudip_programe;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// For user input
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter value of 1st number ::");
	      int a = sc.nextInt();

	      System.out.println("Enter value of 2nd number ::");
	      int b = sc.nextInt();

	       //creating list of functions
	      System.out.println("Enter the function \n +: Addition\n -: Subtraction\n X: Multiplication\n /: Division\n %: Modules ");
	      
	      System.out.println("Select operation :-");
	      String f = sc.next();
	      switch(f) {
	         case "+" ://additions
	         System.out.println("Sum of the given two numbers: "+(a+b));
	         break;
	         case "-" ://substraction
	         System.out.println("Difference between the two numbers: "+(a-b));
	         break;
	         case "x" ://multipicaltion
	         System.out.println("Product of the two numbers: "+(a*b));
	         break;
	         case "/" ://divide
	         System.out.println("Result of the division: "+(a/b));
	         break;
	         case "%"://Reminder using Modulus
	        	 System.out.println("Modules"+(a%b));
	         break;
	         default :
	         System.out.println("Wrong Input");
	}

}
}
