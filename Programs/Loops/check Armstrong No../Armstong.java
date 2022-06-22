package Anudip_programe;

import java.util.Scanner;

public class Armstrong{

	public static void main(String[] args) {
		
    // user input   
        Scanner sc = new Scanner(System.in);
        int s=0,r;
        
        System.out.print("Enter the Number = ");
        int num = sc.nextInt();
        int n = num;
        
        do {
        	r=num%10;
        	s=s+(r*r*r);
        	num = num/10;
        }while(num>0);
       if(s==n) {
	   System.out.println("Armstrong No.");
       }
       else {
    	   System.out.println("Not Armstrong No.");
       }
	}

}
