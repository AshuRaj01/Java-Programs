package Anudip_programe;

import java.util.Scanner;

public class bitwise_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value A :");
		int a = sc.nextInt();
		
		System.out.println("Enter the value B :");
		int b = sc.nextInt();
        // bitwise and
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        System.out.println("a^b = " + (a ^ b));

	}

}
