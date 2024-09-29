package day13;

import java.util.ArrayList;

public class Problemex5_2 {
  public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<>();

    while ( true ) {
      all.add((int)(Math.random() * 11));
      if ( all.get(all.size() - 1) == 0) break;
    }

    for (int num: all) {
      System.out.println("0~10の値を出力：" + num);
    }

    for ( int i = all.size() - 1; i >= 0; i-- ) {
      System.out.print(all.get(i) + " ");
    }
    System.out.println();
  }
}
