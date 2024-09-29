package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problemex5_5 {
  public static void main(String[] args) throws IOException {
    ArrayList<String> strs = new ArrayList<>();

    while ( true ) {
      System.out.print("文字列を入力: ");
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      //  コンソールから文字列の読み込み
      String buf = br.readLine();

      if (buf.trim().equals("")) break;

      strs.add(buf);
    }

    // 逆順
    for (int i = strs.size() - 1; i >= 0; i--) {
      if (strs.get(i).trim().length() >= 5) {
        strs.remove(i);
      }
    }

    System.out.print("5文字未満の単語: ");
    for ( String s : strs) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
