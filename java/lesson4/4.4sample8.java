class sample8 {
  public static void main(String[] args) {

    int inum = 160;

    System.out.println("身長は"+inum+"センチです。");

    System.out.println("double型の変数に代入します");

    //キャスト演算子　double dnum = (double)inum;でも可能
    double dnum = inum;

    System.out.println("身長は"+dnum+"センチです。");


  }
}
