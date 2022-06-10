package Anudip_programe;

import java.util.Scanner;

public class Arithimatic_p {

		public static void main(String[] args)
	    {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Value of Num1 =  ");
	        int num1 = sc.nextInt();
	        
	        System.out.println("Enter the Value of Num2 =  ");
	        int num2 = sc.nextInt();
	  
	        // Displaying num1 and num2
	        System.out.println("num1 = " + num1);
	        System.out.println("num2 = " + num2);
	  
	        System.out.println("Arithmetic Opreator's :- ");
	        
	        int add = num1+num2;
	        int sub = num1 - num2;
	        int divide = num1 /num2;
	        int multiply = num1*num2;
	        int mod = num1%num2;
	        
	        System.out.println("Additions = " + add);
	        System.out.println("Subtraction = " + sub);
	        System.out.println("Divide = " + divide);
	        System.out.println("Multiplication = " + multiply);
	        System.out.println("Modules = "+mod);
	}

}
