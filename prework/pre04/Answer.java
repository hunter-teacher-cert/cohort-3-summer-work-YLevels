//created this to help check my answers

import java.io.*;
import java.util.*;

public class Answer{
int n = 4;
public static void nLines(int n) {
    if (n > 0) {
        System.out.println();
        nLines(n - 1);
    }
}


public static void main(String[] args) {
System.out.print("line 1");
  nLines(4);
  }

}