package day6;

public class Problem602 {
  public static void main(String[] args) {
    Calc c = new Calc();
    double a = 4.0, b = 2.0;
    System.out.println(a + " + " + b + " = " + c.add(a,b));
    System.out.println(a + " - " + b + " = " + c.sub(a,b));
    System.out.println(a + " * " + b + " = " + c.mul(a,b));
    System.out.println(a + " / " + b + " = " + c.div(a,b));
  }
}
