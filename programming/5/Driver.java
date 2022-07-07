import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * collaborators: Stacy Goldstein (stacyG)
Yeidy Levels (YLevels) 
Usman Ahmed (usman0527)
David Moste (dmoste)
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;

	//assign var the address of a newly-apportioned Time object
	t = new Time(12,30,30);
  System.out.println(t.toString());
  t.set(2,55,00);
  System.out.println(t.toString());
  
    }//end main()

}//end class