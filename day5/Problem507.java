package day5;

public class Problem507 {
  public static void main(String[] args) {
    // init
    int[] data = new int[5];
    for ( int i = 0; i < 5; i ++ ) {
      data[i] = (int)(Math.random() * 10 ) + 1;
    }

    //sum avg
    int sum = 0;
    for ( int i = 0; i < 5; i ++ ) {
      sum += data[i];
    }
    double avg = sum / 5;
    
    System.out.println("合計値：" + sum);
    System.out.println("平均値：" + avg);

    // disp
    System.out.print("平均値より大きい数：");
    for ( int i = 0; i < 5; i ++ ) {
      if ( data[i] > avg ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();

    System.out.print("平均値より小さい数：");
    for ( int i = 0; i < 5; i ++ ) {
      if ( data[i] < avg ) {
        System.out.print(data[i] + " ");
      }
    }
    System.out.println();
  }
}
