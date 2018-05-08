class Car {
  protected int num;
  protected double gas;

  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
}

class RacingCar extends Car {
  private int course;

  public RacingCar() {
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }
}

class sample9 {
  public static void main(String[] args) {
    Car[] cars;
    cars = new Car[2];

    for (int i = 0; i<cars.length;i++) {
      Class c1 = cars[i].getClass();
      System.out.println((i+1)+"番目のオブジェクトのクラスは"+c1+"です。");
    }
  }
}
