import java.io.*;

class sample3 {
  public static void main(Stirng[] args) throws IOException {
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    //検索される文字を入力させる
    String str1 = br.readLine();

    System.out.println("検索文字を入力してください。");

    //検索する文字を入力させる
    String str2 = br.readLine();
    char ch = str2.charAt(0);

    //文字を検索する
    int num = str1.indexOf(ch);

    //見つかった文字の位置を出力します
    if (num != -1) {
      System.out.println(atr1+"の"+(num+1)+"番目に「" + ch +"」が見つかりました。");
    } else {
      System.out.println(str1+"に「" + ch +"」はありません。");
    }


  }
}
