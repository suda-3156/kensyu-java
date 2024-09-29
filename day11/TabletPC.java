package day11;

public class TabletPC extends Computer {
  public TabletPC() {
    super("タブレットPC");
  }

  public void input() {
    System.out.println("タッチパネルディスプレイをタップして操作");
  }

  public void output() {
    System.out.println("タッチパネルディスプレイに出力");
  }
}
