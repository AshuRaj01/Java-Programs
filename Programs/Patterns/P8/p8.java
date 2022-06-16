package loops;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*********
// *******
//  *****
//   ***
//    *
		int rows = 6;
		
		  for (int i = rows - 1; i >= 1; i--)
			{
				for (int j = rows; j >= i; j--)
				{
					System.out.print(" ");
				}
				for (int k = 1; k <= (i * 2) - 1; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
