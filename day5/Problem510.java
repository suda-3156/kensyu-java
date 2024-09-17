package day5;

public class Problem510 {
  public static void main(String[] args) {
    // init
    int[] a = new int[7];
    for ( int i = 0; i < 7; i ++) {
      a[i] = (int)(Math.random() * 10 ) + 1;
      System.out.print(String.format("a[%d]=%d ", i, a[i]));
    }
    System.out.println();

    // disp
    for ( int i = 0; i < 7; i ++) {
      for ( int j = 0; j < a[i]; j ++ ) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
