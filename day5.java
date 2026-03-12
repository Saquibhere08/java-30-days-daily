import java.util.Scanner;
class day5
{
	public static void main(String [] arg)
	{
		int area;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the value of length(in cm) =  ");
		int length= sc.nextInt();
		
		System.out.print("Enter the value of lengt width(in cm) =  ");
		int width= sc.nextInt();
		
		area=length * width; //formula

		System.out.println("Area of Rectangle(in cm): "+area);

	}
}