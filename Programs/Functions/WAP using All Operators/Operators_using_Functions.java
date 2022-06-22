package Functions;

import java.security.PublicKey;
import java.util.Scanner;

public class Operators_using_Functions{
     //WAP to accept two no from user and do the process of swapping by using 3rd variable and also with without using 3rd variable.
	public static void main(String[] args) {
		
      accept();
	}

	public static void accept(){
	
		int x, y;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		x = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		y = sc.nextInt();  
		
		//function : "swap"
		System.out.println("Swap using 2 variable's :-");
		System.out.println("Before Swapping\n x = "+x+"\n y = "+y);  
		swap(x, y);
		
		//function : "swap3"
		System.out.println("Swap using 3 variable's :-");
		System.out.println("Before Swapping\n x = "+x+"\n y = "+y);
		swap3(x,y);
		
		}  
		public static void swap(int a, int b)  
		{  
		//swapping logic  using two variable
		a = a + b;  
		b = a - b;  
		a = a - b;  
		System.out.println("After Swapping\nx = "+a+"\ny = "+b);  
		
	}
		
		 public static void swap3(int m, int n)
		    {
		        // Swapping the values using 3rd variable
		        int temp = m;
		        m = n;
		        n = temp;
		        System.out.println("After Swapping\nx = "+m+"\ny = "+n);  
		    }
}
