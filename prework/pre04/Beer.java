import java.io.*;
import java.util.*;

public class Beer{

public static void countdown(int n) {
  
  //lyrics for last verse
  
  if (n == 0) {
    System.out.println("No bottles of beer on the wall");
    System.out.println("no bottles of beer,");
    System.out.println("ya' can't take one down, ya' can't pass it around,");
    System.out.println("'cause there are no more bottles of beer on the wall!");
  } else {

    //lyrics for the entire song
    
    System.out.println(n + " bottles of beer on the wall");
    System.out.println(n + " bottles of beer,");
    System.out.println("ya' take one down, ya' pass it around,");
    System.out.println((n-1) + " bottles of beer on the wall.");
    System.out.println();
    countdown(n-1);
  }
  
}

  
public static void main(String[] args) {


  countdown(99);
}
} 