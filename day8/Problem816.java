package day8;

public class Problem816 {

  private static int sumOfDivs(int n) {
    int sum = 0;
    for (int i = 1; i < n ; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 10000; i++) {
      int sum1 = sumOfDivs(i);
      if (sum1 <= 10000) {
        int sum2 = sumOfDivs(sum1);
        if (sum2 == i && i > sum1 ) {
          System.out.println("( " + i + " , " + sum1 + " )");
        }
      }
    }
  }
}
