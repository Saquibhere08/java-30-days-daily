import java.util.Scanner;
public class day3
{
	public static void main(String[] arg)
	{
		//Take two numbers from user input and print their sum.
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int num2=sc.nextInt(	);

		//adding the two numbers

		int result = num1 + num2;

		System.out.println("Result: "+result);	
	}
}