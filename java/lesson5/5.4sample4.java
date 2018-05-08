import java.io.*;

class sample4 {
  public static void main(String[] args) throws IOException {
    System.out.println("整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    if (res == 1) {
      System.out.println("１が入力されました。");
    } else if (res == 2) {
      System.out.println("２が入力されました。");
    } else {
      System.out.println("１か２を入力してください。");
    }
  }
}
