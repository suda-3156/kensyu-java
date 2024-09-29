package day12;

public class CellPhone implements IPhone,IMailer,IComputer {
  //  メールを送信する
  public void sendMail(){
    System.out.println("メールを送る");
  }
  //  メールを受信する
  public void recieveMail(){
      System.out.println("メールを受信する");
  }
  //  webを閲覧する
  public void borwseWeb(){
      System.out.println("ウェブを閲覧する");
  }
  //  ゲームをする
  public void playGame(){
      System.out.println("ゲームをする");
  }
  //  電話をかける
  public void callPhone(){
      System.out.println("電話を掛ける");
  }
  //  電話を受ける
  public void recievePhone(){
      System.out.println("電話を受ける");
  }
}
