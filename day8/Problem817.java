package day8;

public class Problem817 {
  public static void main(String[] args) {
    int[] lockers = new int[50];

    // init
    for (int i = 0; i < lockers.length; i++) {
      lockers[i] = 1;
    }

    // process
    for (int i = 1; i <= 50; i++) {
      for (int j = i; j <= 50; j += i) {
        lockers[j-1] = lockers[j-1] * -1;
      }
    }

    // count
    int count = 0;
    for (int i : lockers) {
      if (i == -1) {
        count++;
      }
    }

    System.out.println("開いているロッカーの数: " + count);
  }
}
