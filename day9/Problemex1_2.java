package day9;

public class Problemex1_2 {
  public static void main(String[] args) {
    int a = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
    int b = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
    int c = Integer.parseInt(args[0]);

    int result = mul(a,b, c);  //  二つの数の積を求める
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println(a + " * " + b + " * " + c + " = " + result);
  }
  //  掛け算
  static int mul(int a,int b, int c){
      return a * b * c;
  }
}
