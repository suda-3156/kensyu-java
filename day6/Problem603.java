package day6;

public class Problem603 {
  public static void main(String[] args) {
    Circle c = new Circle();
    //  円の半径を設定
    c.r = 4.0;
    System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());
    System.out.println("半径" + c.r +"の円の面積は" + c.area());
    
  }
}
