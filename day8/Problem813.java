package day8;

import java.util.ArrayList;

public class Problem813 {
  public static void main(String[] args) {
    // init
    ArrayList<Integer> all = new ArrayList<>();
    ArrayList<Integer> prime = new ArrayList<>();
    for (int i = 2; i <= 100; i++) {
      all.add(i);
    }

    while ( all.size() > 2 ) {
      furui(all);
    }
  }

  private static void furui(ArrayList<Integer> list) {
    int first_num = list.get(0);
    for ( int i = 0; i < list.size(); i++ ) {
      if ( list.get(i) % first_num == 0 ) {
        
        list.remove(i);

      }
    }
  }
}
