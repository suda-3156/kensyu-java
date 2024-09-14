package day4;

public class Problem416 {
  public static void main(String[] args) {
    for ( int i = 1; i <= 9; i++ ) {
      for ( int j = 1; j <= 9; j++ ) {
        System.out.print(i + " * " + j + " = " + i*j + " ");
      }
      System.out.println();
    }
  }
}
