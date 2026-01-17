import java.util.Scanner;

public class DataTypesCalculator {

    // Static variable (shared by all objects)
    static int staticCount = 1;

    // Instance variable (belongs to object)
    int instanceCount = 10;

    public static void main(String[] args) {

        // Local variables (exist only inside this method)

        byte b = 10;          // 1 byte
        short s = 100;        // 2 bytes
        int i = 1000;         // 4 bytes
        long l = 100000L;     // 8 bytes
        float f = 12.5f;      // 4 bytes
        double d = 99.99;     // 8 bytes
        char c = 'A';         // 2 bytes
        boolean flag = true;  // 1 bit (logical)

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Java Data Types Calculator -----");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();   // double for decimal precision

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Division not possible (cannot divide by zero).");
        } else {
            double add = num1 + num2;
            double sub = num1 - num2;
            double mul = num1 * num2;
            double div = num1 / num2;

            System.out.printf("Addition: %.2f%n", add);
            System.out.printf("Subtraction: %.2f%n", sub);
            System.out.printf("Multiplication: %.2f%n", mul);
            System.out.printf("Division: %.2f%n", div);
        }

        // Type Casting Demo
        int castInt = (int) num1;        // Explicit casting (double to int)
        double castDouble = castInt;     // Implicit casting (int to double)

        System.out.println("\nType Casting:");
        System.out.println("Double to Int: " + castInt);
        System.out.println("Int to Double: " + castDouble);

        // Variable Scope Demo
        DataTypesCalculator obj = new DataTypesCalculator();
        System.out.println("\nStatic Variable: " + staticCount);
        System.out.println("Instance Variable: " + obj.instanceCount);

        sc.close();
    }
  }

