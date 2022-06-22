package loops;

import java.util.Scanner;

public class sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to accept a No. from user and find out the sum of digit.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No. = ");
		int num = sc.nextInt();
		int n=num;
		int sum = 0;
		int r;
        do {
        	r=num%10;
        	sum=sum+r;
        	num = num/10;
        }while(num>0);
        
        System.out.println("Sum of "+n+" "+"is = "+sum);
	}

}
