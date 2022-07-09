import java.io.*;
import java.util.*;

public class Guess{

public static void main(String[] args) {

  Random random = new Random();
  int number = random.nextInt(100) +1;
  int guess;
  int difference; 
  
  System.out.println("I'm thinking of a number between 1 and 100, including both. Can you guess what it is?");
  System.out.print("Type a number: ");

  Scanner gu = new Scanner(System.in);
  guess = gu.nextInt();
  System.out.println("Your guess: " + guess);

  System.out.println("The number I was thinking of was: " + number);

  difference = number - guess; 

  //after scanning Chapter 4 and Googling the phrase 'Java absolute value' I tried this out

  int value = Math.abs(difference);
  System.out.println("You were off by: " + value);
  
}
}