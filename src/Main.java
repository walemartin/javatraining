import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Future Value Application");
        Scanner sc = new Scanner(System.in);
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        NumberFormat percent=NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(1);

        // set the monthly payment to 100 and display it to the user
        double monthlyPayment=100.0;
        System.out.println("Monthly Payment: "+monthlyPayment);
        System.out.println();

        String table="      ";

        //fill the first row of the table
        for(double rate=4.5;rate<=7.0;rate+=0.5){
            table+=percent.format(rate/100)+"           ";


        }
        table+="\n";

        // loop through each row
        for(int years=4;years >=1;years--){
            //append the years variable to the start of the row
            String row="Yr "+years+" ";
            //loop through each column
            for(double rate=4.5;rate<=7.0;rate+=0.5){
                //calculate the future value for each rate
                int months=years*12;
                double monthlyInterestRate=rate/12/100;
                double futureValue=0.0;
                for (int i=1;i<=months;i++)
                    futureValue=(futureValue+monthlyPayment)*(1+monthlyInterestRate);
                row+= currency.format(futureValue)+"    ";
            }
            table+=row + "\n";
            row="";
        }
        System.out.println(table);


    }



}