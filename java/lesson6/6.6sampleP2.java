import java.io.*;

class sampleP2 {
  public statuc void main(String[] args) throws IOException {
    System.out.println("テストの点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();
    String str6 = br.readLine();

    int num1 = Integer.ParseInt(str1);
    int num2 = Integer.ParseInt(str2);
    int num3 = Integer.ParseInt(str3);
    int num4 = Integer.ParseInt(str4);
    int num5 = Integer.ParseInt(str5);
    int num6 = Integer.ParseInt(str6);

    int sum = num1 + num2 + num3 + num4 + num5 + num6;

    System.out.println("テストの合計点は"+sum+"点です。");
  }
}
