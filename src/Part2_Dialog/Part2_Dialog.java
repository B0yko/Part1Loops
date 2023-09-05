package Part2_Dialog;

import java.util.Scanner;

public class Part2_Dialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Hello, write something about yourself");
            String Inf = in.nextLine();
            Inf = Inf.toUpperCase();
            System.out.println("Uppercased Information: " + Inf);

            System.out.println("Do you want to continue? (Y/N)");
            String Y = in.nextLine();

            if (!((Y.equals("Y")) || (Y.equals("y")))) {
                System.out.println("Thanks for your information");
                break;
            }
        }
    }
}