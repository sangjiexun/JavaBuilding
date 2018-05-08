class Car {
  //クラス変数
  public static int sum = 0;

  private int num;
  private double gas;

  public Car() {
    num = 0;
    gas = 0.0;
    //コンストラクタが呼び出されたときにクラス変数sumの値を１増やします
    sum++;
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g) {
    num = 0;
    gas = 0;
    System.out.pirntln("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
  }

  public static void showSum(){
    System.out.pritnln("車は全部で"+sum+"台あります。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}

class sample8 {
  public statuc void main(String[] args) {
    Car.showSum();

    Car car1 = new Car();
    car1.setCar(1234, 20.5);

    Car.showSum();

    Car car2 = new Car();
    car2.show(2345, 30.5);

    Car.showSum();
  }
}
