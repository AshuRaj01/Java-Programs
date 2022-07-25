
// 1st Step
package single_Inheritance;

import java.util.Scanner;

public class sh{
   static  int n;
	public static void even_odd()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your No. = ");
		 n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is Even Number ");
		}else {
			System.out.println(n+" is Odd Number ");
		}
	}
}
}
