package Anudip_programe;

import java.util.Scanner;

public class vowel{

	public static void main(String[] args) {
		// Write a program to accept a character from user and check it is vowel or not using switch case.
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Character :-");
	      String ch = sc.next();
	      switch(ch) {
	         case "a" :
	         System.out.println(ch+" is Vowel");
	         break;
	         case "e" :
	         System.out.println(ch+" is Vowel");
	         break;
	         case "i" :
	         System.out.println(ch+" is Vowel");
	         break;
	         case "o" :
	         System.out.println(ch+" is Vowel");
	         break;
	         case "u":
	        	 System.out.println(ch+" is Vowel");
	         break;
	         default :
	         System.out.println("You Entered Consunent Character");
	      }

	}

}
