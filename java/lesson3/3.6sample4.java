//キーボードから入力する
import java.io.*;

class sample4 {
  public static void main(String[] arges) throws IOException {
    System.out.println("文字列を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    System.out.println(str + "が入力されました。");
  }
}
