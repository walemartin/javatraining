import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double interestRate;
        double futureValue = 0;
        double monthlyPayment;
        byte month;
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Interest rate: ");
        interestRate=sc.nextDouble();
        System.out.println("Enter monthly payment: ");

        monthlyPayment=sc.nextDouble();
        System.out.println("Enter number of months: ");
        month=sc.nextByte();
        for(int i=1;i<=month;i++){
            futureValue=( futureValue + monthlyPayment)*(1+monthlyPayment);
            System.out.println("Debug: "+i+" The future value is: "+futureValue);
        }

    }



}