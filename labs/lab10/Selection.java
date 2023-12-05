public class Selection {

  /**
    Swaps two elements in an array in place

    @param int j - location of first element to swap
    @param int i - location of second element to swap

  */
  public static void swap(int[] numbs, int j, int i) {
    //TODO: implement this
    // you can just call the static method from BubbleSort
  }

  /**
    Finds the index of the smallest value in the list

    @param int startIdx - the starting index to consider in the list
    @param int[] list - the list to search through

    @return int - the index of the smallest value
  */
  private static int findMinIndx(int startIdx, int[] list) {
    return -1;
  }

  /**
    Helper method that creates string representation of an array

    @param int startIdx
    @param int minIdx
    @param int minVal
    @param int[] numbers - array to return string of
    @return the string represents of the array
  */
  private static String toString(int startIdx, int minIdx, 
                                 int minVal, int[] numbs) {
    String out = startIdx + " | " + minIdx + " | " + minVal + " | ";
    for (int i = 0; i < numbs.length; i++)
      out += numbs[i] + "  "; 

    return out;
  }

  /**
    Helper method that creates string representation of an array

    @param int[] numbers - array to return string of
    @return the string represents of the array
  */
  private static String toString(int[] numbs) {
    String out = "";
    for (int i = 0; i < numbs.length; i++)
      out += numbs[i] + "  "; 

    return out;
  }

  /**
    Sorts the list inplace using selectionSort

    @param int[] list - the array of numbers to sort
  */
  public static void selectionSort(int[] list) {
    //TODO: implement this
    // make sure to call toString() after each swap
    // so that you can see the same results as the tables
    // you just filled in
  }

  public static void main(String[] args) {
    int[] numbs = {9,8,7,6};
    selectionSort(numbs);
    System.out.println(toString(numbs));
    // the above line should print out 6 7 8 9

    int[] numbs1 = {5,10,6,2,7};
    selectionSort(numbs1);
    System.out.println(toString(numbs1));
    // the above line should print out 2 5 6 7 10
  }

}
