package day8;

public class Problem808 {
  public static void main(String[] args) {
    int a = (int)(Math.random() * 1000 )+ 1;
    for (int i = 1; i <= a; i ++ ) {
      if ( a % i == 0) {
        System.out.println(i);
      }
    }
  }
}
