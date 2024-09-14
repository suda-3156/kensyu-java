package day4;

public class Problem412 {
  public static void main(String[] args) {
    int min = 101;
    for ( int i = 0; i < 5; i ++ ) {
      int a = (int)(Math.random() * 100) + 1;
      System.out.println(a);
      if ( a < min ) {
        min = a;
      }
    }
    System.out.println("最小値：" + min);
  }
}
