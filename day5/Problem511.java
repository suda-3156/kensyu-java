package day5;

public class Problem511 {
  public static void main(String[] args) {
    // init
    int[] data = new int[5];
    for ( int i = 0; i < 5; i ++ ) {
      data[i] = (int)(Math.random() * 100 ) + 1;
    }

    //disp all
    for ( int i = 0; i < 5; i ++ ) {
      System.out.print(data[i] + " ");
    }
    System.out.println();

    // < 60
    System.out.print("0以上60未満：");
    for ( int i = 0; i < 5; i ++ ) {
      if ( data[i] < 60 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

    // <80
    System.out.print("60以上80未満：");
    for ( int i = 0; i < 5; i ++ ) {
      if ( 60 <= data[i] & data[i] < 80 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

    // >=80
    System.out.print("80以上：");
    for ( int i = 0; i < 5; i ++ ) {
      if ( data[i] >= 80 ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();
    
  }
}
