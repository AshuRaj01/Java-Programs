package loops;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     *****
//     *   *
//     *   *
//     *****
		
		int n =4;//rows
		int m =5;//columns
		
		//rows
		for(int i = 1;i<=n;i++) {
			//cols
			for(int j = 1;j<=m;j++) {
				//cell -> i,j
				
				if(i==1||j==1||i==n||j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
