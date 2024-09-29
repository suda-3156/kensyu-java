package day14;

import java.util.ArrayList;
import java.util.HashSet;

public class Problemex6_3 {
  public static void main(String[] args) {
    ArrayList<Integer> raw = new ArrayList<>();

    for ( int i = 0; i < 10; i++ ) {
      raw.add((int)(Math.random() * 10) + 1);
    }

    HashSet<Integer> set = new HashSet<>(raw);

    //disp
    System.out.print("乱数: ");
    for ( int i : raw ) {
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.print("出現した数: ");
    for ( int i : set ) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
