package day8;

public class Problem804 {
  public static void main(String[] args) {
    int a = (int)(Math.random() * 1000) + 1;
    int digits = String.valueOf(a).length();
    System.out.println(digits);
  }
}
