

public class ArrayDemo {
  public static void main(String[] args) {
    int[] ary = {1, 2, 3, 4};
    print1Array(ary);
    //int[][] arry = {{1, 2}, {3, 4}, {5, 6}};
    //print2Array(arry);
  }
  public static void print1Array(int[] ary) { //0a. Make a function to print a 1D array of ints.
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
  public static void print2Array(int[][]ary) { //0b. Make a function to print a 2d array of ints.
    
  }

}
