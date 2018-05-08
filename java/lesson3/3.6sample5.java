import java.io.*;

class sample5 {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //文字列を格納
    String str = br.readLine();

    //文字列を整数に変換
    int num = Integer.parseInt(str);

    System.out.println(num + "が入力されました。");
  }
}
