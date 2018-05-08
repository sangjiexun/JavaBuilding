class Car {
  //フィールド
  int num;
  double gas;

  //メソッドの定義
  void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }

  class sample1 {
    public static void main(String[] args) {
      Car car1 = new Car();

      //ナンバーとガソリン量を設定
      car1.num = 1234;
      car1.gas = 30.5;

      car1.show();
    }
  }
}
