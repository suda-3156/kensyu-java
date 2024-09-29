package day8;

public class Problem803 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int res = 1;
    for ( int i = a; i > 0; i -- ) {
      res *= i;
    }
    System.out.println(res);
  }
}
