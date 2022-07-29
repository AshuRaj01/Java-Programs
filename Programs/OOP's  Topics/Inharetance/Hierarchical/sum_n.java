package hierarchical_Inheritance;

public class sum_n extends Accept_m
{
		
		public static void sum()
		{
			int num = accept();
			int res,sum=0;
				
			do
			{
				res=num%10;
				sum=sum+res;
				num=num/10;
			}
			while( num>0);
			System.out.println("The sum of digits is = "+sum);
		}
		
		public static void main(String[] args)
		{
			sum();
			
		}

	}
	

