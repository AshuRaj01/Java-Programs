package loops;

public class patterns3 {

	public static void main(String[] args){
//    *
//   ***
//  *****
// *******
//*********
		int row =5;
		//for row
		for(int i = 1;i<=5;i++) {
			// for space
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			// for columns
			for(int j = 1;j<=i*2-1;j++) {// i*2-1 for odd numbers
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	
}
