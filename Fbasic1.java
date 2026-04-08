package factors;
import java.util.Scanner;
public class Fbasic1 
{
    public static void main(String [] arg)
    {
        // Print factors of a number
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number to Find Factors: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Factors of "+n+"are: "+i);
            }
        }


    }
}
