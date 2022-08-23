import java.util.Scanner;

public class GameDemo
{

    public String divideByNumber(int firstNumber, int secondNumber)
    {

        int quotient=firstNumber/secondNumber;

        return String.valueOf(quotient);

    }

    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;

        GameDemo demo = new GameDemo();


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number : ");
            firstNumber = scanner.nextInt();
            System.out.println("Enter second number : ");
            secondNumber = scanner.nextInt();

            String Division= demo.divideByNumber(firstNumber,secondNumber);
            System.out.println("The Quotient of 2 numbers is : " +Division);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by 0");
        }


    }

}
