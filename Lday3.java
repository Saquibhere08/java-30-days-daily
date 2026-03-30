package loops;
import java.util.Scanner;
public class Lday3 {
    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Sum of Values from 1 to N");
        System.out.println("Enter the Value of N: ");
        int n=sc.nextInt();
        run(n);

    }
    public static void run(int n){
        for(int i=1;i<=n;i++){
            int sum = i + n;
            System.out.println(sum);
        }
    }
    
}
