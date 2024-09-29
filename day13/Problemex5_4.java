package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problemex5_4 {
  public static void main(String[] args) throws IOException{

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

    for ( String i : strs) {
      System.out.print(i + " ");
    }
    System.out.println();

  }
}
