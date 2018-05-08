import java.io.*;

class sample2 {
  public static void main(String[] args) throws IOException {
    System.out.printl;n("テストの受験者数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    //配列要素の数を入力させる
    String str = br.readLine();
    int num = Integer.parseInt(str);

    //必要な数だけ配列要素を準備する
    int[] test;
    test = new int[num];

    System.out.println("人数分の点数を入力してください。");


    for (int i=0; i<num; i++) {
      //キーボードから必要な数だけ点数を入力する
      str = br.readLine();
      int tmp = Integer.parseInt(str);
      //配列要素に点数を格納する
      test[i] = tmp;
    }

    for (int i = 0; i < num; i++) {
      System.out.println((i+1)+"番目の人の点数は" +test[i]+"です。");
    }
  }
}
