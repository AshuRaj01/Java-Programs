package hello;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WAP to accept student name, rollno, marks of 5 subject calculate Percentage and display the output.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name :- ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Roll No. :- ");
		int rooln = sc.nextInt();
		
		System.out.println("Enter your Subject Marks  :- ");
		
		System.out.println("English = ");
		int eng = sc.nextInt();
		
		System.out.println("Hindi = ");
		int hindi = sc.nextInt();
		
		System.out.println("Maths = ");
		int math = sc.nextInt();
		
		System.out.println("SST =  ");
		int sst = sc.nextInt();
		
		System.out.println("Science =  ");
		int science = sc.nextInt();
		
		
		int t = eng+hindi+math+sst+science;
		System.out.println("Percentage Marks = "+t*100/500+"%");
		
		
		
	}

}
