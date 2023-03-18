import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double interestRate;
        double futureValue = 0.0;
        double monthlyInvestment;
        byte years;
        System.out.println("Future Value Application");
        Scanner sc = new Scanner(System.in);
        String choice="y";
        while (!choice.equalsIgnoreCase("n")){
            System.out.println("Enter yearly interest rate: ");
            interestRate=sc.nextDouble();
            System.out.println("Enter monthly investment: ");

            monthlyInvestment=sc.nextDouble();
            System.out.println("Enter number of years: ");
            years=sc.nextByte();

            // onvert yearly to monthly values and initialize future value
            double monthlyInterestRate=interestRate/12/100;
            int months=years * 12;

            for(int i=1;i<=months;i++){
                futureValue=(futureValue+monthlyInvestment)*(1+monthlyInterestRate);
            }

            NumberFormat currency=NumberFormat.getCurrencyInstance();
            System.out.println("Future Value: "+currency.format(futureValue));
            System.out.println();

            //see if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice=sc.next();
            System.out.println();



        }



    }



}