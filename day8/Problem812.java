package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Problem812 {
  public static void main(String[] args) {
    // init
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    
    for ( int i = 0; i < 10; i ++ ) {
      list1.add((int)(Math.random() * 10) + 1);
      list2.add((int)(Math.random() * 10) + 1);
    }
    
    HashSet<Integer> mergedList = new HashSet<>();
    mergedList.addAll(list1);
    mergedList.addAll(list2);

    HashSet<Integer> inter_set = new HashSet<>();
    for ( int i = 0; i < list1.size(); i ++ ) {
      if ( list2.contains(list1.get(i))) {
        inter_set.add(list1.get(i));
      }
    }
    
    ArrayList<Integer> union = new ArrayList<>(mergedList);
    ArrayList<Integer> intersection = new ArrayList<>(inter_set);

    Collections.sort(intersection);
    Collections.sort(union);

    dispArray("配列1", list1);
    dispArray("配列2", list2);
    dispArray("共通の数", intersection);
    dispArray("どちらかに入っている数", union);
  }

  private static <T> void dispArray(String name, ArrayList<T> list) {
    System.out.print(name + ": ");
    for (T ele : list) {
      System.out.print(ele + " ");
  }
    System.out.println();
  }
}
