package Exceptions_Handling;

import java.util.Scanner;

public class Arithmethic_pro {

	int res,num1,num2;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	    	Arithmethic_pro obj = new Arithmethic_pro();
	    	obj.sum();
	}
	
	public void sum()
	{
		try
		{
		System.out.println("Enter a number A : ");
		num1=sc.nextInt();
		
		System.out.println("Enter a number B : ");
		num2=sc.nextInt();
		
		//division
		res=num1/num2;
		System.out.println("The div is = "+res);
		
		//additions
		res=num1+num2;
		System.out.println("The add is = "+res);
		}
		catch(Exception e)
		{
			System.out.println("Cannot "+e.getMessage());
		 //System.out.println("Second MSG Cannot be 0 :)");     	
		}
	}
}
