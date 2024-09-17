package day5;

public class Problem503 {
  public static void main(String[] args) {
    // init
    int[] data = new int[10];
    for ( int i = 0; i < 10; i ++ ) {
      data[i] = (int)(Math.random() * 100 ) + 1;
    }

    // odd
    System.out.print("奇数：");
    for ( int i = 0; i < 10; i ++ ) {
      if ( data[i] % 2 == 1 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

    // even
    System.out.print("偶数：");
    for ( int i = 0; i < 10; i ++ ) {
      if ( data[i] % 2 == 0 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

  }
}
