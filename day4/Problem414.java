package day4;

public class Problem414 {
  public static void main(String[] args) {
    int n = (int)(Math.random() * 10) + 1;
    if ( n % 2 == 0 ) {
      for (int i = 0; i < n; i ++ ) {
        System.out.print(" ★ ");
      }
      System.out.println();
    } else {
      for (int i = 0; i < n; i ++ ) {
        System.out.print(" ☆ ");
      }
      System.out.println();
    }
  }
}
