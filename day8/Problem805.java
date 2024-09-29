package day8;

public class Problem805 {
  public static void main(String[] args) {
    for ( int i = 1; i < 101; i ++ ) {
      if ( i % 3 == 0 || String.valueOf(i).contains("3") ) {
        System.out.println(i);
      }
    }
  }
}
