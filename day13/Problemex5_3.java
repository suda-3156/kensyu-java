package day13;

import java.util.ArrayList;

public class Problemex5_3 {
  public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<>();

    while ( true ) {
      all.add((int)(Math.random() * 101));
      if ( all.get(all.size() - 1) == 0) break;
    }

    // init
    ArrayList<ArrayList<Integer>> onesPlaceGroups = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        onesPlaceGroups.add(new ArrayList<>());
    }

    // classify
    for (int num : all) {
        int onesPlace = num % 10;
        onesPlaceGroups.get(onesPlace).add(num);
    }

    // disp
    for ( int i : all ) {
      System.out.println("0~100の値を出力: " + i);
    }
    System.out.println();

    for (int i = 0; i < 10; i++) {
        ArrayList<Integer> group = onesPlaceGroups.get(i);
        if (group.isEmpty()) {
            System.out.println("一の位が" + i + " : なし");
        } else {
            System.out.print("一の位が" + i + " : ");
            for (int number : group) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
  }
}
