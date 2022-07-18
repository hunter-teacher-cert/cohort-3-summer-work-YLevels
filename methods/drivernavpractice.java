//barGraphify(int[] nums) takes an array of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index.
// if x=[0,1,2,3] then barGraphify(x) will output
// 0:
// 1: =
// 2: ==
// 3: ===

// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

  public static String barGraphify(int[] x)
  {
    String retStr = "=";
    for (int row=0; row < a.length; row++ ) 
    {
      retStr += "\n"; //retStr = retStr + "/n"
    }
    return retStr;
  }