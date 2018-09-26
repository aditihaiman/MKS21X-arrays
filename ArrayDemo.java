

public class ArrayDemo {
  public static void main(String[] args) {
    int[] ary = {1, 2, 3, 4};
    print1DArray(ary); //returns [1, 2, 3, 4]

    int[][] arry = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // returns [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print2DArray(arry);
    
  }

  public static void print1DArray(int[] ary) { //0a. Make a function to print a 1D array of ints.
    System.out.print("[");
    for (int x = 0; x < ary.length; x++) {
      if (x == ary.length - 1) {
        System.out.print(ary[x]);
      }
      else {
        System.out.print(ary[x] + ", ");
      }
    }
    System.out.print("]\n");
  }

  public static void print2DArray(int[][]arry) { //0b. Make a function to print a 2d array of ints.
    System.out.print("[[");
    String tempOutput = "";
    for (int x = 0; x < arry.length; x++) {
      for (int y = 0; y < arry[x].length; y++) {
        if (y == arry[x].length-1) {
          tempOutput += arry[x][y] + "], [";
        }
        else {
          tempOutput += arry[x][y] + ", ";
        }
      }
      if (x == arry.length-1) {
        System.out.print(tempOutput.substring(0, tempOutput.length()-4) + "]]");
      }
    }
  }


}
