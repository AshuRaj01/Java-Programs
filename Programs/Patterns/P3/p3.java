package loops;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        1
//        10
//        101
//        1010
//        10101
    
    //rows
		for(int i = 1;i<=5;i++) {
      
      //columns
			for(int j = 1;j<=i;j++) {
        
        //for 1 or 0
				if(j%2==0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}

