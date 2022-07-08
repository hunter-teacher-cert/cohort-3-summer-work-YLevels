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
  int index = s.length() - 1;
  String reverseString = "";
  char letter =  s.charAt(index);
      while (index >= 0) 
      {
        // s = s + String.valueOf(s.charAt(index - 1));
        // index--;
        //reverseString = (String.valueOf(s.charAt(index)));
        reverseString = ;
        index--;
      }
    return reverseString;
  }

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