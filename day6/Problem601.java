package day6;

public class Problem601 {
  public static void main(String[] args) {
    Minmax m = new Minmax();
    int a = 4, b = 2, c = 9;
    System.out.println(String.format("%dと%dと%dのうち、最大のものは%d", a,b,c,m.max(a,b,c)));
    System.out.println(String.format("%dと%dと%dのうち、最小のものは%d", a,b,c,m.min(a,b,c)));
  }
}
