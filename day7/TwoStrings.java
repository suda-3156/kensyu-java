package day7;

public class TwoStrings {
  //  一つ目の文字列
  private String string1;
  //  二つ目の文字列
  private String string2;
  //  一つ目の文字列を設定
  public void setString1(String string1)
  {
    this.string1 = string1;
  }
  //  二つ目の文字列を設定
  public void setString2(String string2)
  {
    this.string2 = string2;
  }
  //  一つ目の文字列を取得
  public String getString1()
  {
    return string1;
  }
  //  二つ目の文字列を取得
  public String getString2()
  {
    return string2;
  }

  public String getConnectedString() {
    return string1 + string2;
  }
}
