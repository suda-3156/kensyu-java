package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problemex6_2 {
  public static void main(String[] args) throws IOException {
    HashMap<Integer, String> kansuji = new HashMap<>();
    kansuji.put(0, "〇");
    kansuji.put(1, "一");
    kansuji.put(2, "二");
    kansuji.put(3, "三");
    kansuji.put(4, "四");
    kansuji.put(5, "五");
    kansuji.put(6, "六");
    kansuji.put(7, "七");
    kansuji.put(8, "八");
    kansuji.put(9, "九");

    System.out.print("整数の値を入力してください: ");
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    //  コンソールから文字列の読み込み
    String buf = br.readLine();

    if (!buf.matches("\\d+")) {
      System.out.println("入力が無効です。整数のみ入力してください。");
      return;
    }

    // 3桁ごとにコンマを挿入
    StringBuilder formattedInput = new StringBuilder(buf);
    int length = buf.length();
    for (int i = length - 3; i > 0; i -= 3) {
        formattedInput.insert(i, ",");
    }

    // 数字を漢字に変換
    StringBuilder res = new StringBuilder();
    for (char digit : formattedInput.toString().toCharArray()) {
      if (digit == ',') {
        res.append(",");
      } else {
        res.append(kansuji.get(Character.getNumericValue(digit)));
      }
    }

    // 結果を出力
    System.out.println("変換結果: " + res.toString());
  }
}
