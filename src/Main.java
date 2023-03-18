import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String ProductDescription;
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
       String ProductCode=sc.next();
       switch(ProductCode)
       {
           case "hm01":
               System.out.println(ProductDescription="Hammer");;
               break;
           case "bn03":
               System.out.println(ProductDescription="Box of Nails");;
               break;
           default:
               System.out.println(ProductDescription="Product not found");;
               break;


       }
    }



}