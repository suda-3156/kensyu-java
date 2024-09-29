package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_1 {
  public static void main(String[] args) throws IOException {
    HashMap<String, String> animal = new HashMap<>();
    String keys[] = { "cat", "dog", "bird", "tiger"};
    animal.put(keys[0], "猫");
    animal.put(keys[1], "犬");
    animal.put(keys[2], "鳥");
    animal.put(keys[3], "虎");
  
    System.out.print("英語で動物の名前を入力してください：");
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    //  コンソールから文字列の読み込み
    String buf = br.readLine();

    if ( animal.get(buf) == null) {
      System.out.println("対応するデータは登録されていません。");
    } else {
      System.out.println("「" + animal.get(buf) + "」です．");
    }
  }
}
