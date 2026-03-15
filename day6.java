//Day 5: Convert Celsius to Fahrenheit (F = (C × 9/5) + 32).
import java.util.Scanner;
class day6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Tempreture(in C'): ");
		int temp= sc.nextInt();

		//
		int fren= (temp*(9/5)+32);
		System.out.print("Your Tempreture(in F'): "+fren);
	}
}