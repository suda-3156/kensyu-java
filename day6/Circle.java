package day6;

public class Circle {
  //  半径
  public double r;
  //  円周の長さを求める
  public double circumference(){
    return 2 * 3.14 * r;
  }
  // area
  public double area(){
    return r * r * 3.14;
  }
}
