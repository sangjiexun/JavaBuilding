class Car {
  protected int num;
  protected double gas;

  public Car() {
    num = 0;
    gas = 0.0;
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

class RacingCar {
  private int course;

  public RacingCar() {
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }

  public void setCourse(int c) {
    course = c;
    System.out.println("コース番号を"+course+"にしました。");
  }

  public void newshow() {
    //スーパークラスのprotectedにはアクセスできる
    System.out.println("レーシングカーのナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
    System.out.println("コース番号は"+sourse+"です。");
  }
}

class sample3 {
  public statuc void main(String[] args) {
    RacingCar rccar1 = new RacingCar(1243,45.9,5);
    rccar1.show()
  }
}
