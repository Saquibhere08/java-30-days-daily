package Conditions;
import java.util.Scanner;
public class Cbasics2 {
	public static void main(String [] arg) {
		//Print odd numbers from 1 to N
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Value of N: ");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i+" is Odd Number.");
			}
		}
	}
}
