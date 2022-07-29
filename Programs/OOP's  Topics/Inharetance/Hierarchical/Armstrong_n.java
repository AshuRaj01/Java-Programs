package hierarchical_Inheritance;

public class Armstrong_n extends Accept_m{

	public static void arm()
	{
		int number = accept();
		int  originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}
	
	public static void main(String[] args) {
		arm();

	}
	
}
