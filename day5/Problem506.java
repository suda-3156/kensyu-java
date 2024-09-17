package day5;

public class Problem506 {
  public static void main(String[] args) {
    // init
    int[] data = new int[10];
    for ( int i = 0; i < 10; i ++ ) {
      data[i] = (int)(Math.random() * 10 ) + 1;
    }

    // max min avg
    int max = 0;
    int min = 11;
    int sum = 0;
    for ( int i = 0; i < 10; i ++ ) {
      if ( data[i] > max ) {
        max = data[i];
      }
      if ( data[i] < min ) {
        min = data[i];
      }
      sum += data[i];
    }
    double avg = sum / 10;

    // disp
    System.out.println(String.format("最大値：%d", max));
    System.out.println(String.format("最小値：%d", min));
    System.out.println(String.format("平均値：%.2f", avg));
  }
}
