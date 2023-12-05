public class Bubble {

  /**
    Swaps two elements in an array in place

    @param int j - location of first element to swap
    @param int i - location of second element to swap

  */
  public static void swap(int[] numbs, int j, int i) {
    //TODO: implement this
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
    Sorts the list inplace using bubbleSort

    @param int[] list - the array of numbers to sort
  */
  public static void bubbleSort(int[] list) {
    //TODO: implement this
    // make sure to call toString() after each comparision
    // so that you can see the same results as the tables
    // you just filled in
  }

  public static void main(String[] args) {
    int[] numbs = {9,8,7,6};
    bubbleSort(numbs);
    System.out.println(toString(numbs));
    // the above line should print out 6 7 8 9

    int[] numbs1 = {5,10,6,2,7};
    bubbleSort(numbs1);
    System.out.println(toString(numbs1));
    // the above line should print out 2 5 6 7 10
  }

}
