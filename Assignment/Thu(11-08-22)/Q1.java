/*Write a program to accept full name form the user and display the abbreviations of the 
  irst and middle names except the last name which is displayed as it is. EG: Name:Manoj 
  akesh Gupta  . (M.R.Gupta)*/

package Practice;

import java.util.Scanner;

public class Q1 {

	  public static void main(String[] args)
	  {
		  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter your Firstname, MiddleName & Lastname");
	        String name = sc.nextLine();
	        System.out.println(name);
	        String[] arr = name.split(" ",3);
	        System.out.println("Out Put \n"+arr[0].charAt(0)+"."+arr[1].charAt(0)+"."+arr[2]);
	    }
	} 
