package day8;

import java.util.ArrayList;

public class Problem813 {
  private static ArrayList<Integer> prime = new ArrayList<>();
  public static void main(String[] args) {
    // init
    ArrayList<Integer> all = new ArrayList<>();
    for (int i = 2; i <= 100; i++) {
      all.add(i);
    }

    while ( all.size() != 0 ) {
      furui(all);
    }

    System.out.print("素数: ");
    for ( int i : prime ) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private static void furui(ArrayList<Integer> list) {
    int first_num = list.get(0);
    list.remove(0);
    prime.add(first_num);
    for ( int i = list.size() - 1 ; i >= 0; i-- ) {
      if ( list.get(i) % first_num == 0 ) {
        list.remove(i);
      }
    }
  }
}
