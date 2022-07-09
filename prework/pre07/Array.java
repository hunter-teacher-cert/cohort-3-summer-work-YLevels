import java.io.*;
import java.util.*;

public class Array {
  
  public static void main(String[] args) {
  
    powArray();
   histogram();
    int numValues = 8;
  int [] array = randomArray(numValues);

  
  printArray(array);
  }

  public static void powArray() {
    /*takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.*/
     double [] values = new double [4];
    values[0] = 7;
    values[1] = values[0] * 2;
    values[2]++;
    values[3] -= 60;

    double [] valuesSquared = new double [values.length];

    double exponent;
    Scanner in = new Scanner(System.in);

//receive data here
 System.out.print("Type exponent here: ");
  exponent = in.nextDouble();
  in.nextLine();

    for (int i = 0; i < values.length; i++) {
      valuesSquared[i] = Math.pow(values[i], exponent);
    }
 System.out.println(Arrays.toString(values));
System.out.println(Arrays.toString(valuesSquared));
  }

  public static void histogram () {
    //write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.
    
    }
  public static int[] randomArray(int size) {
      Random random = new Random();
    int [] a = new int[size];
    for (int i = 0; i <a.length; i++) {
      a [i] = random.nextInt(100);
    }
    return a;
  
    }
  public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
  
}
    


