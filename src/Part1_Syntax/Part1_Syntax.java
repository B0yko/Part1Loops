package Part1_Syntax;

import java.util.Scanner;
public class Part1_Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while demonstrations.
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int i1 = 0;
        while (i1 <= 10) {
            System.out.print("#");
            i1++;
        }
        System.out.println();
        int i2 = 0;
        int i3 = 10;
        while (i2 < i3) {
            System.out.print("*");
            i2++;
        }
        System.out.println();
        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;
            int l = 1;
            while (l < k) {
                System.out.print(l);
                l++;
            }
        }
        //for loop demonstrations
        System.out.println();
        for (int a = 0; a <= 10; a++) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
        for (int b = 10; b >= 0; b--) {
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println();
        String s = "Loops project";
        for (int c = 0; c < s.length(); c++) {
            System.out.println(s.charAt(c));
        }
        for (int f = 0; f <= 10; f++) {
            System.out.println();
            for (int f1 = 0; f1<=f; f1++) {
                System.out.print(f1);
            }
        }
    }
}
