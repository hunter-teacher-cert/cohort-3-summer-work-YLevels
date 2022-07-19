import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    l.add("last");
    l.add("next");
     l.add("another");
    l.add("first");
    System.out.println(l);
    System.out.println("Hello");
  System.out.println(l.get(0));
    System.out.println(l.get(1));
     System.out.println(l.get(3));
    System.out.println("This is the size of head:" + l.size());
    l.add(2, "added data");
    l.add(0, "hope it worked!");
    System.out.println(l);
  }
}