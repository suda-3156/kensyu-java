package day4;

public class Problem408 {
  public static void main(String[] args) {
    while (true) {
      int n = (int)(Math.random() * 10) + 1;
      System.out.println(n);
      if ( n == 10 ) {
        System.out.println("終了します");
        break;
      }
    }
  }
}
