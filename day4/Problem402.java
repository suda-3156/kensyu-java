package day4;

public class Problem402 {
  public static void main(String[] args) {
    int n = (int)(Math.random() * 10) +1;
    System.out.println("数：" + n);
    int i = 0;
    while ( i < n ) {
      System.err.print("◼︎");
      i ++;
    }
    System.out.println();
  }
}
