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
//................................................................................................................................
// 2nd Step

package multi_level_inheritance;

public class demo1 extends demo
{
	
	public static void greater() {
		
		System.out.println("Enter the Value of A = ");
		 a = sc.nextInt();
		
		System.out.println("Enter the Value of B = ");
		 b = sc.nextInt();
		
		System.out.println("Enter the Value of C = ");
		 c = sc.nextInt();
		
		if(a>b || a>c) {
			System.out.println("A is Greater No.");
		}else if(b>a || b>c){
			System.out.println("B is Greater No.");
		}else {
			System.out.println("C is Greater No.");
		}
		
	}

}

//........................................................................................................................................
// 3rd Step

package multi_level_inheritance;

public class demo2 extends demo1
{

	public static void vowel()
	{
		System.out.print("Enter the Character = ");
		 alph = sc.next().charAt(0);
		
		switch(alph) {
		case 'a' :
	         System.out.println("Vowel");
	         break;
	         case 'e' :
	         System.out.println(" Vowel");
	         break;
	         case 'i' :
	         System.out.println(" Vowel");
	         break;
	         case 'o' :
	         System.out.println(" Vowel");
	         break;
	         case 'u':
	        	 System.out.println(" Vowel");
	         break;
	         default :
	         System.out.println("You Entered Consunent Character");
		}
	}
}
//.......................................................................................................................................
//4th Step

package multi_level_inheritance;

public class print {

	public static void main(String[] args) {
		
		System.out.println("\t\t\t\t\tMulti Level Inheritance\t\t\t\t\t");
		demo2 obj = new demo2();
		obj.swap();
		obj.greater();
		obj.vowel();

	}

}
