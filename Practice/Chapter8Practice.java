import java.io.*;
import java.util.*;

//Chapter 8 CS Awesome 2D Arrays
public class Chapter8Practice 
{

  //getAverage method computes the average of all the values within any integer array. It uses a nested for loop (one loop inside of another loop) to loop/traverse through all of the elements of the 2D array. 
  public static double getAverage (int[][] a) 
  {
    double total = 0;
    int value = 0;
    for (int row = 0; row < a.length; row++) 
    {
      for (int col = 0; col < a[0].length; col++) 
      {
        value = a[row][col];
        total = total + value;
      } //end column for loop 
    } //end row for loop
    return total / (a.length * a[0].length);
  } //end method

  //getLargest method traverases through all of the elements of the 2D array 
  public static int getLargest(int[][] a)
  {
    int largest = a[0][0];
    int current = 0;
    for (int r = 0; r < a.length; r++) 
    {
      for (int c = 0; c < a[0].length; c++) 
      {
        current = a[r][c];
        if (current > largest) 
        {
          largest = current;
        } //end if
      } //end column loop
    } //end row loop
    return largest;
  } //end method

  //columnMajorTraversal method prints out the array by columns. It is void because it does not return something.
  public static void columnMajorTraversal(int[][] a) 
  {
    for (int col = 0; col < a[0].length; col++) 
    {
      for (int row = 0; row < a.length; row++) 
      {
        System.out.println ( a [row][col] );
      } //end row for loop
    } //end column for loop
  } //end method

  //getSum method uses a nested enhanced for-each loop. It traverses through the elements of an array by row to update the total sum. I still do not understand how to verbalize what the colon is doing (I know it is read as "the integer array named innerArray in the integer array named a")
  public static double getSum (int[][] a) 
  {
    double total = 0;
    for (int[] innerArray : a) 
    {
      for (int val : innerArray) 
      {
        total = total + val;
      } 
    }
    return total;
  }
  
  public static void main (String[] args) 
  {
    int [][] matrix = { {1,2,3},{4,5,6}};
    System.out.println("The average of the array named matrix is " + getAverage(matrix));
    System.out.println("The largest value in the array named matrix is " + getLargest(matrix));
    System.out.println("The values in the array named matrix printed by column: ");
    columnMajorTraversal(matrix);
    System.out.println("The total sum of the values in the array named matrix is " + getSum(matrix));
  }
  
}