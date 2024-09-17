package day7;

public class Calculation {
  private int num1;
  private int num2;

  public void setNumber1 (int num) {
    this.num1 = num;
  }
  public void setNumber2 (int num) {
    this.num2 = num;
  }

  public int getNumber1 () {
    return this.num1;
  }
  public int getNumber2 () {
    return this.num2;
  }

  public int add () {
    return this.num1 + this.num2;
  }
  public int sub () {
    return this.num1 - this.num2;
  }
}
