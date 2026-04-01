package loops;
import java.util.Scanner;
public class Lday4 {
    public static void main(String [] args){
        //calculate the factorial of any number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();

        int fac=1;

        for(int i=1;i<=num;i++){
            fac=fac*i;
            System.out.println("factorial of any number is: "+fac);
        }

    }
}
