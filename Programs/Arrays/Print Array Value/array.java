package Arrays;

import java.util.Scanner;

public class array{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();
		int arr[] = new int[size];
		
		
		System.out.println("Enter the value of Array : ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" Array Valuse are :-");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
