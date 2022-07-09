/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */

public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    if (s.length() == 0) //if the length of the word is 0,
    {
      return ""; //return an empty String.
    } //end if
    else //if the length of the word is greater than 0,
    {
      return reverseR(s.substring(1)) + s.charAt(0); 
      /**visual example for the word "when"
          reverseR(when) returns "hen" + 'w'
                  (hen) returns "en" + 'h'
                  (en) returns "n" + 'e'
                  (n) returns 'n'
                  recursive method goes back up and concatenates:
                  'n' + 'e' + 'h' + 'w'
                  java toString method automatically converts 
                  characters to String. 
      */
      
    } //end else
  } //end method

  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}