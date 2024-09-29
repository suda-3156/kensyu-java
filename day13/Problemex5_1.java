package day13;

import java.util.ArrayList;

public class Problemex5_1 {
  
  public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<>();
    ArrayList<Integer> evens = new ArrayList<>();
    ArrayList<Integer> odds = new ArrayList<>();

    while ( true ) {
      all.add((int)(Math.random() * 11));
      if ( all.get(all.size() - 1) == 0) break;
    }
  
    for (int num : all) {
        if (num % 2 == 0) {
            evens.add(num);
        } else {
            odds.add(num);
        }
    }
  
    for (int num: all) {
        System.out.println("0~10の値を出力：" + num);
    }
  
    System.out.print("偶数：");
    for (int even : evens) {
        System.out.print(even + " ");
    }
    System.out.println();
  
    System.out.print("奇数：");
    for (int odd : odds) {
        System.out.print(odd + " ");
    }
    System.out.println();
    
  }

}
