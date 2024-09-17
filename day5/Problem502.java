package day5;

public class Problem502 {
  public static void main(String[] args) {
    double d[] = { 0.2, -5.1, 3.2, 1.8 };
    for ( int i = 0; i < 4; i ++ ) {
      System.out.print(String.format("d[%d]=%.1f", i, d[i]));
    }
    System.out.println();
  }
}
