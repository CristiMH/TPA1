package TPA4;

import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        NumbersComparator numbersComparator = new NumbersComparator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double arg1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar: ");
        double arg2 = scanner.nextDouble();

        if (arg1 == arg2) {
            System.out.println(arg1 + " = " + arg2  + " | Numerele sunt egale");
        }
        else {
            System.out.println(numbersComparator.max(arg1, arg2) + " este mai mare");
            System.out.println(numbersComparator.min(arg1, arg2) + " este mai mic");
        }
    }
}
