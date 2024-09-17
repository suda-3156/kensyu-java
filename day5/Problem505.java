package day5;

public class Problem505 {
  public static void main(String[] args) {
        // init
        int[] data = new int[10];
        for ( int i = 0; i < 10; i ++ ) {
          data[i] = (int)(Math.random() * 10 ) + 1;
        }
    
        // 3 | data[i]
        System.out.print("3の倍数");
        for ( int i = 0; i < 10; i ++ ) {
          if ( data[i] % 3 == 0 ) {
            System.out.print(data[i] + " ");
          }
        }
        System.out.println();
    
        // 3 !| data[i] 
        System.out.print("3の倍数以外の数");
        for ( int i = 0; i < 10; i ++ ) {
          if ( data[i] % 3 != 0 ) {
            System.out.print(data[i] + " ");
          }
        }
        System.out.println();
  } 
}
