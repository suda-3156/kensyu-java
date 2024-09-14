package day4;

public class Problem411 {
  public static void main(String[] args) {
    int max = 0;
    for ( int i = 0; i < 5; i ++ ) {
      int a = (int)(Math.random() * 100) + 1;
      System.out.println(a);
      if ( a > max ) {
        max = a;
      }
    }
    System.out.println("最大値：" + max);
  }
}
