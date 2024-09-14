package day4;

public class Problem415 {
  public static void main(String[] args) {
    for ( int i = 1; i <= 100; i ++ ) {
      System.out.print(i + " ");
      if ( i % 10 == 0 ) {
        System.out.println();
      }
    }
  }
}
