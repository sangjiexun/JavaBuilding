//Carクラスの宣言(仕様)です
class Car {
  int num;
  double gas;
}

class sample1 {
  public static void main(String[] args) {

    //オブジェクトの作成
    Car car1 = new Car();

    //ナンバーとガソリン量を代入します
    car1.num = 1234;
    car1.gas = 20.5;

    System.out.println("車のナンバーは"+car1.num+"です。");
    System.out.println("ガソリン量は"+car1.gas+"です。");

  }
}
