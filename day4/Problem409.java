package day4;

public class Problem409 {
  public static void main(String[] args) {
    while (true) {
      int n = (int)(Math.random() * 100) + 1;
      System.out.println(n);
      if ( n % 10 == 0 ) {
        System.out.println("終了します");
        break;
      }
    }
  }
}
