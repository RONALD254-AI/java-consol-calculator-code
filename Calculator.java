import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;;

        while (true) {
            System.out.println("1. multiply");
            System.out.println("2. divide");
            System.out.println("3. add");
            System.out.println("4. Subtract");
            System.out.println("5. Exit");
            System.out.println("Enter you choise from 1 to 5:");
            int choise = scanner.nextInt();

            if (choise==5) {
                System.out.println("Exit the program.");
                break;
                
            }
            switch(choise){
                case 1:
                result = num1 * num2;
                System.out.println("Answer: " + result);
                break;

                case 2:
                result = num1 / num2;
                System.out.println("Answer: " + result);
                break;

                case 3:
                result = num1 + num2;
                System.out.println("Answer: " + result);
                break;

                case 4:
                result = num1 - num2;
                System.out.println("Answer:" + result);
                break;

                default:
                System.out.println("Invalid choice . Please try again,");
            }

        }
        scanner.close();

    }
    
}
