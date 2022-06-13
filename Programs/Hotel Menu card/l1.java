package loops;

import java.util.Scanner;

public class l1 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int total = 0;
		char ans;
		System.out.println("\t\t\t Srivastav HOTEL ");
		
		do {
			System.out.println("Menu :- \n 1: Starter's\n 2: Main Cours \n 3: Dessert");
			System.out.print("Enter your Order :");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				   System.out.println("Starter's Are :- \n 1: Aloo Pakora = Rs 20 \n 2: Samosa = Rs 15 \n 3: Veg Manchurian = Rs 120");
				   System.out.print("Enter the Iteam :-");
				     int ch1 = sc.nextInt();
				     switch(ch1) {
				     case 1: System.out.print("\tAloo Pakora = \t\t");
				             total+=20;
				             System.out.println("Total Amount = "+"Rs"+" "+total);
				     break;
				     case 2:
				    	 System.out.println("\tSamosa\t\t");
			             total+=15;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				     case 3:
				    	 System.out.println("\tVeg Manchurian\t\t");
			             total+=120;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				    	 default:
				    		 System.out.println(" Please Enter Vaild Input");
				     }
				     break;
			case 2 :
				System.out.println("Main Cours are :- \n1: CEDAR-PLANK SALMON = Rs 140 \n2: SEARED SCALLOPS WITH BROWN AND LEMON PAN SAUCE = Rs 90 \n3: GIRLLED PIZZA = Rs 180 ");
				System.out.print("Enter the Iteam :-");
				int main = sc.nextInt();
				switch(main) {
			     case 1: System.out.println("\tCEDAR-PLANK SALMON\t\t");
			             total+=140;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("\tSEARED SCALLOPS WITH BROWN AND LEMON PAN SAUCE\t\t");
		             total+=90;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("\tGIRLLED PIZZA\t\t");
		             total+=180;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter Vaild Input");
			     }
				break;
			case 3 : 
				System.out.println("Dessert's are :- \n1: Classic chocolate mousse = Rs 50 \n2: Fudge Ice-Cream = Rs 40 \n3: Chocolate Coolie Icebox Dessert = Rs 120 ");
				System.out.print("Enter the Iteam :-");
				int dessert = sc.nextInt();
				switch(dessert){
			     case 1: System.out.println("\tClassic chocolate mousse\t\t");
			             total+=50;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("\tFudge Ice-Cream \t\t");
		             total+=40;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("\tChocolate Coolie Icebox Dessert \t\t");
		             total+=120;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter Vaild Input");
			     }
			}
			
			System.out.println("Do you want to Add more Items :  Y/N");
			 ans = sc.next().charAt(0); 
		}
		while(ans == 'y'|| ans =='Y');
		
		System.out.println("Thank You For Coming :) ");
	}
}
