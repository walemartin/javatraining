import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(5));
    }
    public static int factorial(int n)
    {
     if(n==1){
         System.out.println("factorial( "+n+" ) = 1");
         return 1;
     }
     else {
         //recursion is a method being inside of itself
         System.out.println("factorial( "+n+" ) ="+n+"* factorial( "+(n-1)+" )");
     return n*factorial(n-1);
     }

    }

}