package Exceptions_Handling;

import java.util.Scanner;

public class nested_try_block 
{
	//globally Declared
	int num1,numn2,res,num2;
	Scanner sc=new Scanner(System.in);
	
	
	//derived method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		nested_try_block obj=new nested_try_block();
		
	}
	
	nested_try_block ()//constructor
	{
		try
		{
			System.out.println("Enter the value A = ");
			num1=sc.nextInt();
			
			System.out.println("Enter the value A = ");
			num2=sc.nextInt();
		
			res=num1/num2;
			System.out.println("The div is="+res);
			try
			{
				String demo=null;
				System.out.println("Lenght="+demo.length());
			}
			catch(Exception e)
			{
				System.out.println("MSG="+e.getMessage());
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("The second no cannot be zero");
		}
		finally 
		{
			System.out.println("This is my finally block :)");
			
		}
		
	}

}

