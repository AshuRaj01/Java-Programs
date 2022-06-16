package Assisment;

public class A2 {

	public static void main(String[] args) {
		// Write a Program to accept a no from user and display the fibonacci series 
		
		int a=0, b=1;
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
