import java.io.*;
import java.util.*;

public class Time{

public static void main(String[] args) {

int startHour = 21;
int startMinute = 50;
int startSecond = 00;
int hour = 22;
int minute = 18;
int second = 00; 
  
  System.out.print("The current time is ");
  System.out.print(startHour);
  System.out.print(":");
  System.out.print(startMinute);
  System.out.println(".");

  System.out.print("Number of minutes since midnight: ");
  System.out.println(startHour * 60 + startMinute);
  
  System.out.print("Number of seconds remaining in the day: ");
  System.out.println((24 * 60 * 60) - ((startHour * 60 + startMinute) * 60));

  System.out.print("Percentage of the day that has passed: ");
  System.out.println((100 - ((24 * 60 * 60) - ((startHour * 60 + startMinute) * 60)) * 100 / (24 * 60 * 60)));

  System.out.print("Elapsed time since I've started working on this exercise: ");
  System.out.print((hour * 60 + minute) - (startHour * 60 + startMinute));
  System.out.print(" minutes");
}
  
}