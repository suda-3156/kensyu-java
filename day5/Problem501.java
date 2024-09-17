package day5;

public class Problem501 {
  public static void main(String[] args) {
    int[] a = new int[7];
    for ( int i = 0; i < 7; i ++) {
      a[i] = (int)(Math.random() * 10 ) + 1;
      System.out.print(String.format("a[%d]=%d ", i, a[i]));
    }
    System.out.println();
  }
}
