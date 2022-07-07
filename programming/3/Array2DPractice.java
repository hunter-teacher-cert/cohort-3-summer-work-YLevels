import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Yeidy Levels
 * collaborators: Parmanand Mohanlall, Rachel Kaufman
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   + buildBoard (34)
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   + printBoard (46)
   + setRow (64)
   + copyBoard (72)
   Intermediate level (complete Basic methods plus this method):
   + explodeSquare (85)
   Advanced level (complete Basic + Intermediate + these two methods):
   + explodeAllChar * (179)
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/



public class Array2DPractice
{
  // buildBoard creates a 2d array of specified size
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

// printBoard prints a 2D array in a grid to the shell
  public static void printBoard( char[][] board )
  {
        for (int i = 0; i < board.length; i++)
          //increments through the rows
        {
          
      for (int j = 0; j < board[i].length; j++) {
        //prints each column for a given row
        System.out.print(board[i][j]+ " ");
      }
        System.out.println();
          //at the end of each row, go to next line
    }
  }

// setRow sets all the elements in the specified row to value.
  public static void setRow( char[][] board, int row, char value )
  {
      for (int j = 0; j < board[row].length; j++) {
        board[row][j]=value;
      }
  }

// copyBoard creates and returns a new 2D array of char the same size as original and copies all the elements
  public static char[][] copyBoard( char[][] original )
  {
     char[][] newBoard = new char[original.length][original[0].length];

    for(int i=0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        newBoard[i][j] = original[i][j];
      }
    }
    return newBoard;
  }

// explodeSquare changes all the items around (but not including) a given value to 'X'. When typing this into the main method, the user needs to include the name of the array, the row, and the column to "explode".
  public static void explodeSquare( char[][] board, int row, int col )
  {
    //creates variables that stand for the starting and ending column around the target square
    int start, end;

    //this if loop checks to see if target square is on left edge. If it isn't...
    if (col > 0) {
      //...declares start to be the column to the left...
      start = col-1;
      //...and change the element to the left of the target square to X
      board[row][col-1] = 'X';
    } else {
      //...otherwise starting column will be that target square's column and we exit out of this loop
      start = col;
    }
    //this if loop checks to see if the target square is on the right edge. If it isn't...
    if (col < board[0].length-1) {
      //...declares end to be 2 columns after the target square because we do not want to change that square. col+1 is the last one we want to change. col+2 is beyond the scope, so we use strictly less than to exclude col+2 in rows 147/157
      end = col + 2;
      //changes the element to the right of the target square to X
      board[row][col+1] = 'X';
    } else {
      //...declares end to be 1 columns after the target square. col is the last value we want to change. col+1 is beyond the scope, so we use strictly less than to exclude col+1 in rows 147/157 
      end = col + 1;
    }

/**
target number "col = 8"
"col-1" is 7 (number directly preceding 9)
"col+1" is 9 (number directly following)

if the target is 8, we want to change columns "7, 8, 9" to X
so we need to change
col-1 = 7
col = 8
col+1 = 9
col+2 = 10

j starts at 7 and ends at 9 INCLUSIVE
for(j = col-1; j < col+2 ; j++) <== only increments for as long as j is STRICTLY less than col+2
good? yes
trace:
col-1  col(targ)  col+1  col+2||  j    is j<col+2?
7      8          9       10  ||  7    yes - do the action (change the value here to X)
                              ||  8    yes - change the value here to X!
                              ||  9    yes - change the value here to X!
                              ||  10   nope! don't do anything and exit the loop

  0 1 2 3 4 5 6 7 8 9 10
0 Z Z Z Z Z Z Z Z Z Z
1 Z Z Z Z Z Z Z Z Z Z
2 Z Z Z Z Z X X X Z Z
3 Z Z Z Z Z X T X Z Z
4 Z Z Z Z Z Z Z Z Z Z


***** 9 is the LAST index of our array (remember it starts at 0) 

*/
    
    
    if (row > 0) {    //this if loop checks to to see if target square is not at the top edge
      for (int j=start; j < end; j++) 
      // if the target isn't on the top edge, runs a loop: j will start at one column before target and end one column after target
      {
        // place an X one row before the target in column j (as described above)
      board[row-1][j] = 'X';
       }
    }

    //this if loop checks to see if the target is not at the bottom edge
    if (row < board.length-1) {
     for (int j=start; j < end; j++) {
       //place an X one row below the target 
      board[row+1][j] = 'X';
       }
    }
}

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
   public static void explodeAllChar(char[][] board, char c)
   {
/**
Go through each row starting at row 0.
  Go through each column starting at 0. 
    If the element in this location is equal to c
      use explodeSquare method
*/

  for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == c) {
          explodeSquare (board, i, j);
        }
      }
    }
   }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  // */
  // public static void downString( char[][] board, int row, int col, String word )
  // {
  //   /* YOUR AWESOME CODE HERE */
  // }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    printBoard(b);
    System.out.println();

    setRow(b, 3, 'p');
    printBoard(b);

    // System.out.println();
    // char[][] b2 = copyBoard(b);
    // printBoard(b2);

    //System.out.println();
    explodeSquare(b, 0, 9);
    printBoard(b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */

    System.out.println();
    explodeAllChar(b, 'p');
    printBoard(b);
  }
}

