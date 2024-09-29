package day8;

import java.util.ArrayList;

public class Problem809 {
  public static void main(String[] args) {
    int[] d = new int[10];

    ArrayList<Integer> evens = new ArrayList<>();
    ArrayList<Integer> odds = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      d[i] = (int)(Math.random() * 100) + 1;
    }

    for (int num : d) {
        if (num % 2 == 0) {
            evens.add(num);
        } else {
            odds.add(num);
        }
    }

    for (int num : d) {
        System.out.print(num + " ");
    }
    System.out.println();

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
