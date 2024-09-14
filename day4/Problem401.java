package day4;
public class Problem401 {
  public static void main(String[] args) {
    int n = (int)(Math.random() * 10) +1;
    System.out.println("数：" + n);
    for (int i = 0; i < n; i++) {
      System.err.print("◼︎");
    }
    System.out.println();
  }
}
