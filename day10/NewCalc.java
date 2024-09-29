package day10;

public class NewCalc extends FundCalc {
  public double mul() {
    return getNumber1() * getNumber2();
  }
  public double div() {
    if ( getNumber2() == 0 ) {
      System.out.println("計算できません");
      return getNumber1();
    }
    return getNumber1() / getNumber2();
  }
}
