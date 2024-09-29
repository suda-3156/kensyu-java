package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Problemex6_4 {
  public static void main(String[] args) throws IOException {
    System.out.print("英単語を入力: ");
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    //  コンソールから文字列の読み込み
    String buf = br.readLine();

    ArrayList<Character> array = new ArrayList<>();
    for (char c : buf.toCharArray()) {
        array.add(c);  // 文字を1つずつ追加
    }

    // HashSetで重複を排除
    HashSet<Character> set = new HashSet<>(array);

    // disp
    System.out.print("使用されているアルファベット: ");
    for ( Character i : set ) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
