package Conditionals;
import java.util.Scanner;
public class Cday3 {
	public static void main(String[] args)
	{
		//largest of any 3 numbers
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int num1 =sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int num2 =sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		int num3 =sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is the greatest of the 3 numbers");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the greatest of the 3 numbers");
		}else {
			System.out.println(num3+ "  is the greatest of the 3 numbers");
		}
		
		
	}
}
