package factors;
//Count factors of a number
import java.util.Scanner;
public class Fbasic2
{
    public static void main(String [] arg)
    {
        // Print factors of a number
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number to Find Factors: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println("Factors of "+n+" are: "+i);
            }
        }
        System.out.println("Total Count: "+count);


    }
}
