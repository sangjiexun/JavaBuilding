import java.io.*;

class sample4 {
  public static void main(String[] args) throws IOException {
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    //追加される文字列を入力
    String str1 = br.readLine();

    System.out.println("追加する文字列を入力してください。");

    //追加する文字列を入力
    String str2 = br.readLine();

    //文字列を追加
    StringBuffer sb = new StringBuffer(str1);
    sb.append(str2);

    System.out.println("「"+str1+"」に「"+atr2+"」を追加すると「"+sb+"」です。");
  }
}
