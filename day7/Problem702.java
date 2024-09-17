package day7;

public class Problem702 {
  public static void main(String[] args) {
    TwoStrings s = new TwoStrings();
    s.setString1("Hello");
    s.setString2("World");
    System.out.println("一つ目の文字列は" + s.getString1());
    System.out.println("二つ目の文字列は" + s.getString2());
    System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
  }
}
