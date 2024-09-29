package day8;

import java.util.ArrayList;

public class Problem811 {
    static ArrayList<Integer> tribo = new ArrayList<>();

  public static void main(String[] args) {
    calcTribo(30);
    for ( int i = 0; i < tribo.size(); i ++ ) {
      System.out.print(tribo.get(i) + " ");
    }
    System.out.println();
  }

  private static void calcTribo(int max) {
    int index = 0;
    while ( true ) {
      if ( index == 0 || index == 1 ) {
        tribo.add(1);
      } else if ( index == 2 ) {
        tribo.add(2);
      } else {
        int nextVal = tribo.get(index - 1) + tribo.get(index - 2) + tribo.get(index - 3);
        if ( nextVal > max ) break;
        tribo.add(nextVal);
      }
      index ++;
    }
  }
}
