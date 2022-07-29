package Assignment;

import java.util.Scanner;

public class check_age {
     //Globally
	Scanner sc = new Scanner(System.in);
	 int age;
	 
	//main class
	public static void main(String[] args) {
		check_age obj=new check_age();
		obj.age();
	}
	
	
	//creating age Functions
		public void age()
	{      //using try catch 	Properties
		try {
			  System.out.print("Enter your age : ");
			   age = sc.nextInt();
			   
			  check_Age(age);
		  }
		  catch (ArithmeticException e) {
		   System.out.println(e);
		  }
		 }
		
		
		//Create Function to check the age Valid or not
		public void check_Age(int n) 
		 {
			 if(n> 18)
			 {
				 throw new ArithmeticException("valid age....");
			 }
			 else
			 {
				 
				 throw new ArithmeticException("\n Invalid age ...."
					 		+ "\n age should be greater than 18"); 
			 }
		 }
		
	}

