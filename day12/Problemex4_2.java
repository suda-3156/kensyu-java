package day12;

public class Problemex4_2 {
  public static void main(String[] args) {
    AlarmClock ac = new AlarmClock();   //  アラーム付き時計クラスのインスタンスを生成
    funcAlarm(ac);
    funcClock(ac);
  }
  //  アラームとしての処理
  public static void funcAlarm(IAlarm alarm){
    alarm.setAlarm();   //  アラームのセット
    alarm.alarm();      //  アラームを鳴らす
    alarm.stopAlarm();  //  アラームを止める
  }
  //  時計としての処理
  public static void funcClock(IClock clock){
    clock.adjustTime(); //  時間を調整する
    clock.showTime();   //  時間を表示する
  }
}
