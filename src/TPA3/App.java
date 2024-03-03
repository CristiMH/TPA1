package TPA3;

import java.util.Scanner;

public  class App {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double arg1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea numar: ");
        double arg2 = scanner.nextDouble();
        System.out.println("Introduceti operatia (  +  |  -  |  *  |  /  ): ");
        scanner.nextLine();

        String operator = scanner.nextLine();

        switch(operator) {
            case "+":
                System.out.println("Rezultatul este: "+ calculator.adunare(arg1, arg2));
                break;

            case "-":
                System.out.println("Rezultatul este: "+ calculator.scadere(arg1, arg2));
                break;

            case "*":
                System.out.println("Rezultatul este: "+ calculator.inmultire(arg1, arg2));
                break;

            case "/":
                System.out.println("Rezultatul este: "+ calculator.impartire(arg1, arg2));
                break;

            default:
                System.out.println("Operatie invalida (  +  |  -  |  *  |  /  )");
        }
    }
}