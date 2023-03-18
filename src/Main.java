import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);

        for(int i=1;i<4;i++){
            System.out.println("Outer "+i);
            while(true){
                int number=(int)(Math.random()*10);
                System.out.println("    Inner "+number);
                if(number>7)
                    break;
            }
        }


    }



}