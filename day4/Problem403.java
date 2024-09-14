package day4;

public class Problem403 {
  public static void main(String[] args) {
    int n = (int)(Math.random() * 10) +1;
    System.out.println("数：" + n);
    int i = 0;
    do {
      System.err.print("◼︎");
      i ++;
    } while ( i < n );
    System.out.println();
  } 
}
