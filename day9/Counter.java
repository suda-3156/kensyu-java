package day9;

public class Counter {
    // インスタンスごとのカウント
    private int count = 0;
    // トータルカウントを保持する静的フィールド
    private static int totalCount = 0;

    // コンストラクタ
    public void reset() {
        // インスタンスのカウントをリセット
        count = 0;
    }

    // カウントを増やす
    public void count() {
        count++;
        // トータルカウントも増やす
        totalCount++;
    }

    // インスタンスのカウントを取得
    public int getCount() {
        return count;
    }

    // トータルのカウントを取得（静的メソッド）
    public static int getTotalCount() {
        return totalCount;
    }
}

