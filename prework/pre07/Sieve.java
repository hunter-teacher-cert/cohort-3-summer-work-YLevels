import java.io.*;
import java.util.*;

public class Sieve {

   public static void main(String[] args) {
      int n=15;
      boolean[] primeIndex = sieve(n);
      System.out.println(Arrays.toString(primeIndex));
    }

    public static boolean[] sieve(int n) {
      boolean[] primeArray = new boolean[n];
      for(int i = 2; i < n-1; i++){
        if(isPrimeNumber(i)){
          primeArray[i] = true;
        }
        else{
          primeArray[i] = false;
        }
      }
      return primeArray;
    }

  public static boolean isPrimeNumber(int num){
    boolean flag = true;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
}
