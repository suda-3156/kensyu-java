package day14;

public class Problemex6_5 {
  public static void main(String[] args) {
    String s1 = "hoge";
    String s2 = new String("hoge");
    if(s1.equals(s2)){
      System.out.println(s1 + "と" + s2 +"は、同じ文字列です。");
    }else{
      System.out.println(s1 + "と" + s2 +"は、同じ文字列ではありません。");
    }
  }
}
