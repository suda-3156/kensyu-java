package day13;

import java.util.ArrayList;
import java.util.Collections;

public class Problemex5_7 {
  public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<>();

    while ( true ) {
      int newNum = (int)(Math.random() * 11);
      System.out.println("0～10の値を出力: " + newNum);
      if ( newNum == 0) break;

      int pos = Collections.binarySearch(all, newNum);
      if (pos < 0) {
          pos = -pos - 1;
      }
      all.add(pos, newNum);

      // disp
      System.out.print("出力された数：");
      for (int n : all) {
          System.out.print(n + " ");
      }
      System.out.println();
    }
  }
}
