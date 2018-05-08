import java.io.*;

class sample2 {
  public statuc void main(String[] args) throws IOException {
    System.out.println("英字を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str = br.readLine();

    //大文字に変換します
    String stru = str.toUpperCase();

    //小文字に変換します
    String strl = str.toLowerCase();

    System.out.println("大文字に変換すると"+stru+"です。");
    System.out.println("小文字に変換すると"+strl+"です。");
  }
}
