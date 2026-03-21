import java.util.Scanner;
class Cday1
{
	public static void main(String [] arg)
	{
		//check if a number is positive or negative or zero

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input: ");
		int num=sc.nextInt();
		
		if(num>0){
			System.out.println(num + " is a  Positive number.");
		}else if(num<0){
			System.out.println(num + "is a Negative Number.");
			}
				else{
				System.out.println(num+" Zero");
				}

	}
}