package day9;

public class Problemex1_4 {

    public static void main(String[] args) {
        Counter c1, c2;
        c1 = new Counter();
        c2 = new Counter();
        
        // カウント操作
        c1.count();
        c2.count();
        c2.count();
        c2.reset();
        c1.count();
        c1.count();
        c2.count();
        
        // 各カウンターの値を出力
        System.out.println("c1のカウント数：" + c1.getCount());
        System.out.println("c2のカウント数：" + c2.getCount());
        
        // トータルカウントの値を出力 (静的メソッドを使用)
        System.out.println("トータルのカウント数:" + Counter.getTotalCount());
    }
}

