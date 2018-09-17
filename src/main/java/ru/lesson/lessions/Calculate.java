package ru.lesson.lessions;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();

        String exit = "no";

        while(!exit.equals("yes")) {
            System.out.print("Enter first arg: ");
            int first = reader.nextInt();

            String continueCalc = "no";

            while(!continueCalc.equals("yes")) {
                System.out.print("Enter second arg: ");
                int second = reader.nextInt();

                System.out.print("Enter operator: ");
                String operator = reader.next();

                switch(operator) {
                   case "+":
                    calc.sum(first, second);
                    System.out.println("Results: " + calc.getResult());
                    first = calc.getResult();
                    break;
                   case "-":
                    calc.subtraction(first, second);
                    System.out.println("Results: " + calc.getResult());
                    first = calc.getResult();
                    break;
                   case "*":
                    calc.multiplication(first, second);
                    System.out.println("Results: " + calc.getResult());
                    first = calc.getResult();
                    break;
                   case "/":
                       try {
                           calc.division(first, second);
                       } catch (UserException e) {
                           System.out.println(e.getMessage());
                           System.out.println("Please, enter two parameters.");
                       }
                       System.out.println("Results: " + calc.getResult());
                    first = calc.getResult();
                    break;
                   case "clean":
                    calc.cleanResult();
                    continueCalc = "yes";
                    break;
                   case "exit":
                    continueCalc = "yes";
                    exit = "yes";
                    break;
                }
            }
        }
    }
}