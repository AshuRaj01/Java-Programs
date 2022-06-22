package Anudip_programe;

import java.util.Scanner;

public class profit_loss {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);

	        System.out.print("Enter the Selling price of Product =  ");
	        int sp = sc.nextInt();

	        System.out.print("Enter the Cost price of Product =  ");
	        int cp = sc.nextInt();

	        if(sp == cp)
	        
	        {
	            System.out.println("Zero Profit Zero Loss");
	        }

	        else if(sp > cp)
	        {
	            System.out.println(" You are in profit = "+(sp-cp));
	        }

	        else 
	        {
	            System.out.println("You are in  loss = ");
	        }

	}

}
