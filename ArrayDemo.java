

public class ArrayDemo {
  public static void main(String[] args) { //tests for all solutions
    int[] ary = {1, 2, 3, 4};
    print1DArray(ary); //returns [1, 2, 3, 4]
    int[] ary2 = {-1, 0, };
    print1DArray(ary2); //returns [-1, 0]
    int[] ary3 = {};
    print1DArray(ary3); //returns []

    int[][] arry = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // returns [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print2DArray(arry);
    int[][] arry2 = {{}, {}, {1, 1}}; // returns [[], [], [1, 1]]
    print2DArray(arry2);

    int[][] array1 = {{0, 0}, {}, {1, 2}, {1, 2, 0}}; //returns 3
    System.out.println(countZeros2D(array1));
    int[][] array2 = {{30}, {3}, {1}, {1, 2}}; //returns 0
    System.out.println(countZeros2D(array2));

    int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}; //returns {{3, 1, 1}, {1, 3, 1}, {1, 1, 3}}
    fill2D(arr);
    int[][] arr2 = {{1, 1, 1, 1}, {0}, {0, 0}}; //returns {{3, 1, 1, 1}, {1}, {1, 1}
    fill2D(arr2);




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
      if (arry[x].length == 0) {
        tempOutput += "], [";
      }
      for (int y = 0; y < arry[x].length; y++) {
        if (y == arry[x].length-1) {
          tempOutput += arry[x][y] + "], [";
        }
        else {
          tempOutput += arry[x][y] + ", ";
        }
      }
      if (x == arry.length-1) {
        System.out.print(tempOutput.substring(0, tempOutput.length()-4) + "]]\n");
      }
    }
  }

  public static int countZeros2D(int[][] nums){ //1. Calculate and return how many zeros are in the parameter (a rectangular 2D array of integers)
    int count = 0;
    for (int x = 0; x < nums.length; x++) {
      for (int y = 0; y < nums[x].length; y++) {
        if (nums[x][y] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  public static void fill2D(int[][] vals){ //2a. Fill the given 2-dimensional array
    for (int x = 0; x < vals.length; x++) {
      for (int y = 0; y < vals[x].length; y++) {
        if (x == y) {
          vals[x][y] = 3;
        }
        else {
          vals[x][y] = 1;
        }
      }
    }
    print2DArray(vals);

  }

}
