package Part3_ImprDialog;

import java.util.Scanner;

public class Part3_ImprDialog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, write something and I will put it in reverse.");
            String line = in.nextLine();
            for (int i = line.length() - 1; i >= 0; i--) {
                System.out.print(line.charAt(i));
            }
            System.out.println();
                System.out.println("Do yo want to continue? (Y/N)");
                String Y = in.nextLine();
                if (!((Y.equals("Y")) || (Y.equals("y")))) {
                    System.out.println("Thanks for using our program");
                    break;
            }
        }
    }
}