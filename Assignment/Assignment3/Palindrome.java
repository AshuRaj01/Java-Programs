package Assisment;

import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args) {
		// WAP to accept a no from user and check it is palindrom or not .
		palindrome();// using Function.
	}
	
	//Creating Function 
	 public static void palindrome()
	 {  
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the No. = ");
		 int n= sc.nextInt();
		  int r,sum=0,temp;    
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(sum+" "+" is Palindrome number ");    
		  else    
		   System.out.println("Not palindrome");    
		}  
}
