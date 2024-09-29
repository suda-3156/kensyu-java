package day9;

public class Problemex1_3 {
  public static void main(String[] args) {
    int w = (int)(Math.random() * 10 ) + 1;
    int h = (int)(Math.random() * 10 ) + 1;
    square(w, h);
  }

  public static void square(int w, int h) {
    if ( w <= 0 || h <= 0 ) return;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        System.out.print("◼︎ ");
      }
    }
    System.out.println();
    return;
  }
}
