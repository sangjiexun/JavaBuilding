class Car {
  private int num;
  private double gas;

  //コンストラクタの定義
  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}

class sample4 {
  public static void main(String[] args) {
    //オブジェクトを作成するとコンストラクタが呼び出される
    Car car1 = new Car();

    car1.show();
  }
}
