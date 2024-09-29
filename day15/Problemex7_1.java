package day15;

public class Problemex7_1 {
  public static void main(String[] args) {
    int a[] = { 0 , 1, 2 };
    //  配列の内容を表示
    for(int i = 0; i < 4; i++){
      try {
        System.out.println("a[" + i +"]=" + a[i]);
      } catch (Exception e) {
        System.out.println("配列の範囲を超えています．");
      }
    }
  }
}
