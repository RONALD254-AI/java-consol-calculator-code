import java.util.Scanner;

public class vote_system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your Age: ");
        int age = Integer.parseInt(input.nextLine()); // safer than nextInt()

        if (age >= 18) {
            System.out.println("You are eligible to vote, " + name + "!");
        } else {
            System.out.println("Sorry " + name + ", you are not eligible to vote yet.");
        }

        input.close();
    }
}
