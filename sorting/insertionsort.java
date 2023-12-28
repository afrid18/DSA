// Insertion Sort
public class insertionsort {
  public static void main(String args[]) {
    int[] arr = {20, 35, -15, 7, 55, 1, -22};
    for(int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
      int curr = arr[unsortedIndex];
      int j;
      for(j = unsortedIndex; j > 0 && arr[j - 1] > curr; j--){
        arr[j] = arr[j - 1];
      }
      arr[j] = curr;

    }


    for(int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
    return;
  }
}
