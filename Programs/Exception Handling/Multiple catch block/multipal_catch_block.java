package Exceptions_Handling;

import java.util.Scanner;

public class multipal_catch_block 
{
	//globally declare
	int num1,numn2,res,num2;
	Scanner sc=new Scanner(System.in);
	
	//derived method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		multipal_catch_block obj=new multipal_catch_block();
		obj.use_of_multi();
	}
	
	
	public void use_of_multi()
	{
		try
		{
			System.out.println("Enter the value of A = ");
			num1=sc.nextInt();
			
			System.out.println("Enter the value of B = ");
			num2=sc.nextInt();
		
			res=num1/num2;
			System.out.println("The div is="+res);
		
			int[] arr=new int[5];
		
			arr[4]=89;
		
			System.out.println("The array is ="+arr[4]);
			String demo=null;
			System.out.println("Lenght="+demo.length());
		}
		catch(ArithmeticException ae)//for divisions
		{
			System.out.println("Second no cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException ar)//for Array
		{
			System.out.println("MSG="+ar.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("MSG="+e.getMessage());
		}
	}

}

