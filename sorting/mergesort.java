public class mergesort{
  public static void main(String args[]){
    int[] arr = {20, 35, -15, 7, 55, 1, -22};

    for(int a: arr){
      System.out.println(a);
    }


  }

  public static void mergeSort(int[] arr, int start, int end) {

    mid = (start + end) / 2;

    if(end - start < 2) return;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid, end);
    merge(arr, start, mid, end);
  }


  public static void merge(int[] arr, int start, int mid, int end){
    if(arr[mid - 1] < arr[mid]) return;

    int i = start;
    int j = mid;
    int tempIndex = 0;

    int[] temp = new int[end - start];

  }
}
