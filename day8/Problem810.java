package day8;

import java.util.ArrayList;

public class Problem810 {

  static ArrayList<Integer> fibo = new ArrayList<>();

  public static void main(String[] args) {
    calcFibo();
    for ( int i = 0; i < fibo.size(); i ++ ) {
      System.out.print(fibo.get(i) + " ");
    }
    System.out.println();
  }

  private static void calcFibo() {
    int index = 0;
    while ( true ) {
      if ( index == 0 || index == 1 ) {
        fibo.add(1);
      } else {
        int nextVal = fibo.get(index - 1) + fibo.get(index - 2);
        if ( nextVal > 40 ) break;
        fibo.add(nextVal);
      }
      index ++;
    }
  }
}
