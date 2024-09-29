package day8;

public class Problem801 {
  public static void main(String[] args) {
    int count = 0;
    for ( int i = 1; i <= 100; i ++ ) {
      for ( int j = 1; j <= 100; j ++ ) {
        int squredc = i * i + j * j;
        int c = (int)(Math.sqrt(squredc));
        if ( c * c == squredc) {
          System.out.println(String.format("(a,b,c)=(%d, %d, %d)", i, j, c));
          count ++;
        }
      }
    }
    System.out.println(String.format("合計：%d", count));
  }
}
