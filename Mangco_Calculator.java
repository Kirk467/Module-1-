import java.util.Scanner;

public class MangcoCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:  ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:  ");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        System.out.println("Addition:  " + addition);
        System.out.println("Subtraction:  " + subtraction);
        System.out.println("Multiplication:  " + multiplication);
        System.out.println("Division:  " + division);

        sc.close(); 
    }
}