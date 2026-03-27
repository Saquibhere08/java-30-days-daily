package Conditionals;
import java.util.Scanner;
public class Cday7 {
    public static void main(String [] arg){
    //Day 14: Create a menu program (Pizza, Burger, Coffee) 
    // and print the selected order.
    System.out.println("*********MENU*************");
    Scanner sc=new Scanner(System.in);
    System.out.println("Pizza");
    System.out.println("Burger");
    System.out.println("Coffee");

    System.out.println("What would you like to order?");
    String inp=sc.next();

    switch (inp) {
        case "Pizza":
            System.out.println("Order Ready: Pizza");
            break;
        case "Burger":
            System.out.println("Order Ready: Burger");
            break;
        case "Coffee":
            System.out.println(" Order Ready: Coffee");
            break;
        default:
            System.out.println("No Input. Thank you!");
            break;
    }
}
}
