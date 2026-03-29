package Conditionals;

import java.util.Scanner;
public class Cday5 {

	public static void main(String[] args) {
		/*
		 * Convert marks to 
		 * grade (90–100=A, 80–89=B, 70–79=C, etc.
		*/
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Marks: ");
		int marks=sc.nextInt();
		fun(marks);
		
		}
	public static void fun(int marks) {
		if(marks>=90) {
			//char grade='A';
			System.out.println("A");
	}else if(marks>=80 && marks<=89) {
			//char grade='B';
			System.out.println("B");
	}else if(marks>=70 && marks<=79) {
			//char grade='C';
			System.out.println("C");
	}else {
		System.out.println("fail...");
	}
	//System.out.println(grade);

	}
}
