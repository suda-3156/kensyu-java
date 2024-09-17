package day5;

public class Problem504 {
  public static void main(String[] args) {
    // init
    int[] data = new int[10];
    for ( int i = 0; i < 10; i ++ ) {
      data[i] = (int)(Math.random() * 100 ) + 1;
    }

    // >= 50
    System.out.print("50以上の数：");
    for ( int i = 0; i < 10; i ++ ) {
      if ( data[i] >= 50 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

    // <50
    System.out.print("50以下の数：");
    for ( int i = 0; i < 10; i ++ ) {
      if ( data[i] < 50 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();
    
  }
}
