import java.util.Scanner; 

class Calculator {

  // результат вычисления.
  private int result;

 // суммируем аргументы.
 public void sum(int ... params) {
   this.result = params[0];
   for(int i=1; i<params.length; i++)
      this.result += params[i];
 }
 
 // вычитаем аргументы.
 public void subtraction(int ... params) {
   this.result = params[0];
   for(int i=1; i<params.length; i++)
      this.result -= params[i];
 }    
    
 // умножаем аргументы.
 public void multiplication(int ... params) {
   this.result = params[0];
   for(int i=1; i<params.length; i++)
      this.result *= params[i];
 }
    
 // делим аргументы.
 public void division(int ... params) {
   this.result = params[0];
   for(int i=1; i<params.length; i++)
      this.result /= params[i];
 }
 
 // получить результат вычисления.
 public int getResult() {
   return this.result;
 }

 // Очистить результат вычисления.
 public void cleanResult() {
   this.result = 0;
 }
}

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
                    calc.division(first, second);
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