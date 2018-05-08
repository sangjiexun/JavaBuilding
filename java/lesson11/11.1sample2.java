//クラスの拡張(継承)
//スーパークラス(上位カテゴリ)の宣言
class Car {
  private int num;
  private double gas;

  public Car() {
    num = 0;
    gas = 0;
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }
}

//サブクラス(下位カテゴリ)の宣言
class RacingCar extends Car/*スーパークラスの継承*/ {
  //追加するフィールド
  private int course;

  //サブクラスのコンストラクタ
  public RacingCar() {
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }

  public RacingCar(int n, double g, int c) {
    //スーパークラスの引数2個のコンストラクタが呼び出されるようにする
    super(n,g);
    course = c;
    System.out.println("コース番号"+course+"のレーシングカーを作成しました。");
  }

  //追加するメソッド
  public void setCourse(int c) {
    course = c;
    System.out.println("コース番号を"+sourse+"にしました。");
  }
}

class sample2 {
  public statuc void main(String[] args) {
    //サブクラスのオブジェクト作成
    RacingCar rccar1 = new RacingCar(1244,20.5,5);

    //rccar1.setCar(1234,20.5);
    //rccar1.setCourse(5);
  }
}
