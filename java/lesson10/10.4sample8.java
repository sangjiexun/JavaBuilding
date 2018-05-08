class Car {
  private int num;
  private double gas;
  private String name;

  public Car() {
    num = 0;
    gas = 0.0;
    name = "名無し";
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバーを"+num+"にガソリン量を"+gas+"にしました。");
  }

  public void setName(String nm) {
    name = nm;
    System.out.println("名前を"+name+"にしました。");
  }

  public void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
    System.out.println("名前は"+name+"です。");
  }
}

class sample8 {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.show();

    int number = 1234;
    double gasoline = 30.5;
    String str = "１号車";

    car1.setCar(number , gasoline);
    car1.setName(name);

    car1.show(); 
  }
}
