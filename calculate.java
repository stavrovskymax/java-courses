import java.util.Scanner;

public class calculate
{
 public static void main(String[] arg)
 {
  System.out.println("Выберите действие");
  Scanner in = new Scanner(System.in);
  String s = in.nextLine(); 
  double sum = 0;
  double a = in.nextDouble();
  double b = in.nextDouble();
  char ss = s.charAt(0);
  if (ss == '+') {
     sum = a + b;
  }
  if (ss == '-') {
     sum = a - b;
  }
  if (ss == '*') {
     sum = a * b;
  }
  if (ss == '/') {
     sum = a / b;
  }  
  System.out.println("Sum = " + sum); 
 }
}