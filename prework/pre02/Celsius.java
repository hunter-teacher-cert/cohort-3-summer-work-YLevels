import java.io.*;
import java.util.*;

public class Celsius{

public static void main(String[] args) {

double celsius;
double fahrenheit; 
Scanner cel = new Scanner(System.in);

System.out.print("How many degrees Celsius? ");
celsius = cel.nextInt();
//insert formula for C=F here
  // F = (C x 9/5) + 32
  //to prevent integer division, calculate a percentage rather than a fraction
  //normally, 9/5 = 1.8 but calculated as a percentage it would be 180%

fahrenheit = (celsius * 9/5) + 32;
System.out.print(celsius + " Celsius = ");
System.out.println(fahrenheit + " Fahrenheit");
}
}