package loops;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    *
//   * *
//  * * *
// * * * *
//* * * * *
		int row =5;
    
    //row
		for(int i =1;i<=row;i++) {
      
      //space
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
      //columns
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

