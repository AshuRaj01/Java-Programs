package Assisment;

import java.util.Scanner;

public class Assisment1 {

	public static void main(String[] args) {
		// Write a program to perform operators with the help of function.
		Scanner sc = new Scanner(System.in);
		//arithmetic
		//System.out.println("\t\t\t\t\t\t\tArithmetic Optrators\t\t\t\t\t\t\t\t");
		System.out.print("Enter the Value A = ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Value B = ");
		int b = sc.nextInt();
		
		System.out.println("\t\t\t\t\t\t\tArithmetic Optrators\t\t\t\t\t\t\t\t");
		Arithmetic(a,b);
		
		System.out.println("\t\t\t\t\t\tLogical Opretors\t\t\t\t\t ");
		logical1(a,b);
		
		System.out.println("\t\t\t\t\t\tRelational Opretors\t\t\t\t\t ");
		relational(a,b);
		
		System.out.println("\t\t\t\t\t\tAssigment Opretors\t\t\t\t\t ");
		Assignment(a,b);
		
		System.out.println("\t\t\t\t\t\tBitwise Opretors\t\t\t\t\t ");
		bitwise(a,b);
	}
	

	
	public static void Arithmetic(int a,int b) {
		
		 int s = a+b;
		 int div = a/b;
		 int mul = a*b;
		 int sub = a-b;
		 int mod = a%b;
		 
		 System.out.println("Additions A+b = "+s);
		 System.out.println("Substraction A-b = "+sub);
		 System.out.println("Multiply A+b = "+mul);
		 System.out.println("Divistion A+b = "+div);
		 System.out.println("Modulus A+b = "+mod);
	}
	
	public static void logical1(int a,int b) {
		
		int d = 0;
		
		 if ((a%2==0) && (b%2==0)) {
	            d = a + b;
	            System.out.println("Add 2 even No.: " + d);
	        }
	        else {
	            System.out.println("No.'s are Not Even : ");
	            }
		}
	
	
	
	public static void relational(int a,int b) {
		
 
        // Comparing var1 and var2 
        System.out.println("var1 != var2: "+ (a != b));
        
         System.out.println("var1 == var2: "+ (a == b));
  
		
	}
	
	
	public static void Assignment(int a,int b) {

        System.out.println("Add = " + ( a += b));
        System.out.println("Sub = " +  (a-=b));
        System.out.println("div = " + ( a/=b));
        System.out.println("mul = " + (a*=b));
        System.out.println("mod = " + ( a%=b));
        
	}
	
	public static void bitwise(int a,int b) {
		
		
		  // bitwise and
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        System.out.println("a^b = " + (a ^ b));
	}
	}


