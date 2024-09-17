package day7;

public class Data {
  //  メンバ変数number
  private int number = 0;
  //  メンバ変数comment
  private String comment = "";
  
  public void SetNumber(int num){
    this.number = num;
  }

  public void setComment(String str) {
    this.comment = str;
  }

  public int getNumber() {
    return this.number;
  }

  public String getComment() {
    return this.comment;
  }
}
