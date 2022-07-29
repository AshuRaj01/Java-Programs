// 2nd Step

package multi_level_inheritance;

public class grt_num extends swap
{
	
	public static void greater() {
		
		System.out.println("Enter the Value of A = ");
		 a = sc.nextInt();
		
		System.out.println("Enter the Value of B = ");
		 b = sc.nextInt();
		
		System.out.println("Enter the Value of C = ");
		 c = sc.nextInt();
		
		if(a>b || a>c) {
			System.out.println("A is Greater No.");
		}else if(b>a || b>c){
			System.out.println("B is Greater No.");
		}else {
			System.out.println("C is Greater No.");
		}
		
	}
 }

