package Anudip_programe;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		//Q1 Write a program to accept a no from user if no is even than find out the cube.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" "+"is Even Number");
			int cube = n*n*n;
			System.out.println("Cube = "+cube);
		}
		
		
		

	}

}
