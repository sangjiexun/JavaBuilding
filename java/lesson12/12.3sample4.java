//2つ以上のインターフェイスの実装
//のりものインターフェイス
interface iVehicle {
  void vShow();
}

//材料インターフェイス
interface iMaterial {
  void mShow();
}

//車クラス
class Car implements iVehicle , iMaterial {
  private int num;
  private double gas;

  public Car(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバー"+num+"ガソリン量"+gas+"の車を作成しました。");
  }

  //iVehicleのメソッドの定義
  public void vShow() {
    System.out.println("車のナンバーは"+num+"です。");
    System.out.println("ガソリン量は"+gas+"です。");
  }

  //iMaterialのメソッドの定義
  public void mShow() {
    System.out.println("車の材料は鉄です。");
  }
}

class sample4 {
  public static void main(String[] args) {
    Car car1 = new Car(1234, 23.0);
    car1.vShow();
    car1.mShow();
  }
}
