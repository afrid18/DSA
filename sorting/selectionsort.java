// Selection sort algorithm

public class selectionsort {
  public static void main(String[] args) {
    int[] arr = {20, 35, -15, 7, 55, 1, -22};
    for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
      int largestIndex = 0;
      for(int i = 1; i <= lastUnsortedIndex; i++){
        if(arr[i] > arr[largestIndex]) largestIndex = i;
      }
      swap(arr, largestIndex, lastUnsortedIndex);
    }


    for(int i = 0; i < arr.length; i++) {
      System.out.printf("%d ", arr[i]);
    }

    return;
  }

  public static void swap(int[] arr, int i, int j) {
    if (i == j) return;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return;
  }
}
