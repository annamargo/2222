import java.util.Scanner;

public class Calculator {


    public static class javaProject

    {

        public static void main(String[] args)
        {
            double x; //changed both to doubles
            double y;


            Scanner input = new Scanner(System.in);

            System.out.println("please enter the first number");
            x = input.nextDouble(); //changed to nextDouble

            System.out.println("please enter the second number");
            y = input.nextDouble(); //same here

            Scanner op = new Scanner(System.in);

            System.out.println("Please enter the operation you want to use");
            String whatOp = op.next();

            if (whatOp.equals("+"))
            {
                System.out.println("The answer is " + (x + y));
            }
            else if  (whatOp.equals("-"))
            {
                System.out.println("The answer is " + (x - y));
            }
            else if (whatOp.equals("*"))
            {
                System.out.println("The answer is " + (x * y));
            }
            else if (whatOp.equals("/"))
            {
                System.out.println("The answer is " + (x / y)); //unchanged, you're now doing decimal math!
            }
            else
            {
                System.out.println("Thats not a choice!");
            }


        }
    }


    }
