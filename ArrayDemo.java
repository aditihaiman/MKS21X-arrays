

public class ArrayDemo {
  public static void main(String[] args) { //tests for all solutions
    int[] ary = {1, 2, 3, 4};
    printArray(ary); //returns [1, 2, 3, 4]
    int[] ary2 = {-1, 0, };
    printArray(ary2); //returns [-1, 0]
    int[] ary3 = {};
    printArray(ary3); //returns []

    int[][] arry = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // returns [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    printArray(arry);
    int[][] arry2 = {{}, {}, {1, 1}}; // returns [[], [], [1, 1]]
    printArray(arry2);

    int[][] array1 = {{0, 0}, {}, {1, 2}, {1, 2, 0}}; //returns 3
    System.out.println(countZeros2D(array1));
    int[][] array2 = {{30}, {3}, {1}, {1, 2}}; //returns 0
    System.out.println(countZeros2D(array2));

    int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}; //returns [[3, 1, 1], [1, 3, 1], [1, 1, 3]]
    fill2D(arr);
    printArray(arr);
    int[][] arr2 = {{1, 1, 1, 1}, {0}, {0, 0}}; //returns [[3, 1, 1, 1], [1], [1, 1]]
    fill2D(arr2);
    printArray(arr2);

    int[][] arr3 = {{3, 4, 5}, {-1}, {}}; //returns [[1, 1, 1], [3], []]
    printArray(fill2DCopy(arr3));

  }

  public static void printArray(int[] ary) { //0a. Make a function to print a 1D array of ints.
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

  public static void printArray(int[][] ary) { //0b. Make a function to print a 2d array of ints.
    System.out.print("[[");
    String tempOutput = "";
    for (int x = 0; x < ary.length; x++) {
      if (ary[x].length == 0) {
        tempOutput += "], [";
      }
      for (int y = 0; y < ary[x].length; y++) {
        if (y == ary[x].length-1) {
          tempOutput += ary[x][y] + "], [";
        }
        else {
          tempOutput += ary[x][y] + ", ";
        }
      }
      if (x == ary.length-1) {
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

  public static void fill2D(int[][] vals){ //2a. Fill the given 2-dimensional array of integers with 1's EXCEPT when the row number is the same as the column number: you must fill those with 3's instead.
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
  }

  public static int[][] fill2DCopy(int[][] vals){ //2b. Make a new 2d array the same dimensions as the given parameter.
    int[][] output = new int[vals.length][];
    for (int x = 0; x < vals.length; x++) {
      output[x] = new int[vals[x].length];
    }
    for (int x = 0; x < output.length; x++) {
      for (int y = 0; y < output[x].length; y++) {
        if (vals[x][y] >= 0) {
          output[x][y] = 1;
        }
        else {
          output[x][y] = 3;
        }
      }
    }
    return output;
  }
}
