import java.io.*;
import java.util.*;

public class Methods{

  //coding for Exercise 2
public static boolean isDivisible(int n, int m) {
  return (n % m == 0); 
    

  }

  //coding for Exercise 3
public static boolean isTriangle (int a, int b, int c) {
    return !(a + b < c || a + c < b || b + c < a); 

      //return false;
    //}
  //else return true; 
}


public static void main(String[] args) {

  //this line prints value of Exercise 2
  System.out.println(isDivisible(5, 2));
  System.out.println(isDivisible(4, 2));

  //this line prints value of Exercise 3
  System.out.println(isTriangle(5,6,7));
}
}