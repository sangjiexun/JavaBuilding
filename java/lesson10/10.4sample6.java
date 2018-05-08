//クラス型の変数に代入する
class Car {
  private int num;
  private double gas;

  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");

  }

  public void setCar(int n, double g) {
    num = n;
    gas = g;
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }

}

class sample6 {
  public static void main(String[] args) {
    //car1を宣言した
    Car car1;
    System.out.println("car1を宣言しました。");
    car1 = new Car();
    car1.setCar(1234, 20.5);

    //car2を宣言した
    Car car2;
    System.out.println("car2を宣言しました。");

    car2 = car1;
    System.out.println("car2にcar1を代入しました。");

    System.out.println("car1がさす");
    car1.show();
    System.out.println("car2がさす");
    car2.show()

  }
}
