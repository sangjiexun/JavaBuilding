//車クラス
class Car {
  private int num;
  private double gas;

  //引数を持たないコンストラクタ
  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }

  //引数を２個もつコンストラクタ
  public Car(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}

class sample5 {
  public static void main(String[] args) {
    //引数のないコンストラクタが呼び出される
    Car car1 = new Car();
    car1.show();

    Car car2 = new Car(1234, 20.5);
    car2.show();
  }
}
