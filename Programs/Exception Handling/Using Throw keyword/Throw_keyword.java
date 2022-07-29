package Exceptions_Handling;
import java.util.Scanner;

public class Throw_keyword {
//       Globally Define
		int num;
		Scanner sc=new Scanner(System.in);
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Throw_keyword obj=new Throw_keyword();
			obj.even_odd();
		}
        
		//using try and catch properties for even or odd
		public void even_odd()
		{
			try
			{
				System.out.println("Enter a number");
				num=sc.nextInt();
				check_demo(num);
			}
			catch (ArithmeticException e)
			{
				System.out.println("MSG="+e.getMessage());
			}
		}

		//create function for even or odd
		 void check_demo(int num2) 
		 {
			// TODO Auto-generated method stub
			 if(num2 %2==0)
			 {
				 throw new ArithmeticException("It is an even Number ....");
			 }
			 else
			 {
				 throw new ArithmeticException("It is odd");
			 }
			
		}
	}


