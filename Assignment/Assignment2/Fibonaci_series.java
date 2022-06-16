package Assisment;

public class Fibonaci_series{

	public static void main(String[] args) {
		// Write a Program to accept a no from user and display the fibonacci series 
		
		
		int a =0;
		int b=1;
		
		System.out.println("Fibonaci Series are :-");
		Fibonaci( a,  b); //using function "Fibonaci"
		}

	// creating Function
	public static void Fibonaci(int a, int b) 
	{
		int c ;
		System.out.print(a+" "+b+" ");
		for(int i =1;i<=10;i++) {
			c=a+b;
			System.out.print(c+" ");
			//swap
			a=b;
			b=c;
	}
  }
}

