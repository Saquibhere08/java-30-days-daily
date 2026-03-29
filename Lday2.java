package loops;
import java.util.Scanner;
public class Lday2 {
    public static void main(String[]arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Multiplication Number");
    System.out.print("Enter the Number: ");
    int num =sc.nextInt();
    cal(num);
}

public static void cal(int num)
{
    for(int i=1;i<=10;i++){
        int res= num * i;
        System.out.println(num+ " * " +i + " = " + res);
    }
}
}