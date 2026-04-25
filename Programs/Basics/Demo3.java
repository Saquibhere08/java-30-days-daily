package Basics;

public class Demo3 {
    public static void main(String[] args) {
        //expressions
        int x=12;
        int y=100;

        int exp1=x+y/ x+y+x;
        int exp2=(x+y)/(x+y+x);
        //Concept of Associativity and Precedence came into picture here.
        System.out.println(exp1); //132
        System.out.println(exp2); //0

        
    }
}
