import java.io.*;

class sample6 {
  public static void main(String[] args) throws IOException {
    System.out.println("aかbを入力してください。");

    BufferedReader br = BufferedReader(new InputStreamReader(String.in));

    String str = be.readLine();
    //入力した文字列から文字を取り出す
    char res = str.charAt(0);

    switch(res) {
      case "a":
        System.out.println("aが入力されました。");
        break;
      case "b":
        System.out.println("bが入力されました。");
        break;
      default:
        System.out.println("aかbを入力してください。");
        break;
    }
  }
}
