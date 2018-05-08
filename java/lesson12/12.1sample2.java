//instanceof演算子を使う
//抽象クラスを利用する
//のりものクラス
//抽象クラス
abstract class Vehicle {
  protected int speed;

  public void setSpeed (int s) {
    speed =s;
    System.out.println("速度を"+speed+"にしました。");
  }

  //抽象メソッドshow()
  abstract void show();
}

//車クラス
//抽象クラスの拡張
class Car extends Vehicle {
  private int num;
  private double gas;

  public Car(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
  }

  //show()メソッドの処理の定義
  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
    System.out.println("速度は"+speed+"です。");
  }
}

class Plane extends Vehicle {
  private int flight;

  public Plane(int f) {
    flight = f;
    System.out.println("便"+flight+"の飛行機を作成しました。");
  }

  public void show() {
    System.out.println("飛行機の便は"+flight+"です。");
    System.out.println("速度は"+speed+"です。");
  }
}

class sample1 {
  public static void main(String[] args) {
    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234, 230.4);
    vc[1] = new Plane(232);

    for (int i = 0; i < vc.length; i++) {
      if (vc[i] instanceof Car) {
        System.out.println((i+1)+"番目のオブジェクトはCarクラスです。");
      } else {
        System.out.println((i+1)+"番目のオブジェクトはCarクラスではありません。");
      }
    }
  }
}
