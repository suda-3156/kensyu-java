package day10;

public class Problemex2_2 {
  public static void main(String[] args) {
    NewCalc n = new NewCalc();
    n.setNumber1(10);   //  一つ目の数を設定
    n.setNumber2(2);    //  二つ目の数を設定
    System.out.println(n.getNumber1() + " + " + n.getNumber2() + " = " + n.add());
    System.out.println(n.getNumber1() + " - " + n.getNumber2() + " = " + n.sub());
    System.out.println(n.getNumber1() + " * " + n.getNumber2() + " = " + n.mul());
    System.out.println(n.getNumber1() + " / " + n.getNumber2() + " = " + n.div());
  }
}
