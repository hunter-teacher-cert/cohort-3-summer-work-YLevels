import java.io.*;
import java.util.*;

public class Max {

  public static int indexOfMax () {
    int [] a = {5, 8, 3, 1};
    int maxNumber = 0;
    int i = 0;
    while (i < a.length) {
      if (a[i] > maxNumber) {
        maxNumber = a[i];
        i++;
      } else {
        i++;
      } 
    }
    return maxNumber;
  }

  public static void main (String[] args) {
    
    System.out.println(indexOfMax());
  }

}

//This method cannot be written using an enhanced for loop since this is a search operation and we need to refer to the index to execute it.