package day8;

public class Problem815 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int)(Math.random() * 100 ) + 1;
    }

    // selection sort
    for (int i = 0; i < arr.length - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] > arr[maxIdx]) {
                maxIdx = j;
            }
        }
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = temp;
    }

    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
  }
}
