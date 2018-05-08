//戻り値をもつメソッド
class car {
  int num;
  double gas;

  //int型の値を返すメソッドです
  int getNum() {
    System.out.println("ナンバーを調べました。");
    return num;
  }

  double getGas() {
    System.out.println("ガソリン量を調べました。");
    return gas;
  }

  void setNumGas(int n, double g) {
    num = n;
    gas = g;
    System.out.println("車のナンバーを"+num+"にガソリン量を"+gas+"にしました。");
  }

  void show() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }


  class sample6 {
    public static void main(String[] args) {
      Car car1 = new Car();

      car1.setNumGas(1234,20.5);

      //戻り値を持つメソッドを呼び出し
      //戻り値をnumberとgasolineに代入します
      int number = car1.getNum();
      double gasoline = car1.getGas();

      System.out.println("サンプルから車を調べたところ");
      System.out.println("ナンバーは"+number+"でガソリン量は"+gasoline+"でした。");
    }
  }
}
