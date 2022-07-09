import java.io.*;
import java.util.*;

public class Loops{

public static void main(String[] args) {

//This will print out Exercise 2 if successful.
  System.out.print("The return result for Exercise 2 is: ");
  System.out.printf("%.3f", squareRoot(25.0));
  System.out.println(".");

//This will print out Exercise 3 if successful.
  System.out.println("Exercise 3:");
  power();

//This will print out Exercise 4 if successful.
  System.out.println("Exercise 4:");
  factorial();
}
 
/*methood for Exercise 2:
Write a method called squareRoot that takes a double and returns an approximation of the square root of the parameter, using this technique. You should not use Math.sqrt.
  */
public static double squareRoot(double a) {

  double x = a / 2.0;
  double y = (x + a / x) / 2.0;
  double d = (Math.abs(x-y));
  
  while (d > 0.0001) {
    x = y;
    y = (x + a / x) / 2.0;
    d = (Math.abs(x-y));
  }
  
  double result = y;
      return result;
  
}

/*method for Exercise 3:
Write an iterative method called power that takes a double x and an integer n and returns x^n. 
  */
public static void power() {

  int base;
  int exponent;
  Scanner in = new Scanner(System.in);

  //receive data here
 System.out.print("Type base here: ");
  base = in.nextInt();
  in.nextLine();
  System.out.print("Type exponent here: ");
  exponent = in.nextInt();

//compute value here
  double x = base; 
  double n = exponent;
  double value = x;

if (n <= -1) {
  double absValueExponent = Math.abs(n);
         value = 1 / x;
          while (absValueExponent >= 2) {
          absValueExponent = (absValueExponent - 1);
          value = (value / x);
          }
}
if (n == 0) {
  value = 1;
} if (n >= 1) {
      value = x;
         while (n >= 2) {
          n = (n - 1);
          value = (value * x); 
      
  }
  }
 
  //print out result here
  System.out.printf("%d to the power of %d\n", base, exponent);
  System.out.println(" = " + value + ".");
  
}

/*method for Exercise 4:
Write an iterative version of factorial.
  */

public static void factorial(){

  int number; 
  Scanner in = new Scanner(System.in);
  int value;

  System.out.print("Type a whole number here: ");
  number = in.nextInt();

  int n = number;

  if (n <= 0) {
    value = 1;
  }
  if (n >= 1) {
    value = n;
      while (n >=2) {
        value = (value * (n-1));
        n = (n - 1);
      }
  } else {
    value = 0;
  }
  System.out.println("The factorial of " + number + " = " + value);
}
  }
