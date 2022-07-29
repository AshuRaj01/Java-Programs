//  1st Step
package multi_level_inheritance;

import java.util.Scanner;

public class demo {
     static Scanner sc = new Scanner(System.in);
    static int a,b,temp,c,alph;
	public static void swap()
	{
		System.out.println("Enter teh value of A = ");
		 a = sc.nextInt();
		 
		 System.out.println("Enter teh value of B = ");
		 b = sc.nextInt();
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("A = "+a+" B = "+b);
	}
}
}
