package Anudip_programe;

import java.util.Scanner;

public class Relatinaol_p {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value Num 1 :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the value Num 2 :");
		int n2 = sc.nextInt();
 
        // Displaying var1, var2, var3
        System.out.println("Num1 = " + n1);
        System.out.println("Num2 = " + n2);
 
        // Comparing var1 and var2 and
        System.out.println("var1 == var2: "+ (n1 != n2));
   }

}
