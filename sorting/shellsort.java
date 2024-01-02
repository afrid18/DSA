// Shell sort algorithm
public class shellsort{
  public static void main(String[] args) {
    int[] arr = {20, 35, -15, 7, 55, 1, -22};

    for(int gap = arr.length / 2; gap > 0; gap /= 2) {

      for(int i = gap; i < arr.length; i++){
        int j = i;
        int curr = arr[j];

        while(j >= gap && arr[j - gap] > curr) {
          arr[j] = arr[j - gap];
          j -= gap;
        }

        arr[j] = curr;
      }
    }

    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    return;
  }
}
