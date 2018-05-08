import java.io.*;

class sampleP5{
  public static void main(String[] args) throws IOException {
    System.out.println("科目１〜５の点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);
    int num3 = Integer.parseInt(str3);
    int num4 = Integer.parseInt(str4);
    int num5 = Integer.parseInt(str5);

    int sum = num1 + num2 + num3 + num4 + num5;
    double ave = sum / 5;

    System.out.println("５科目の合計点は"+sum+"点です。");
    System.out.println("５科目の平均点は"+ave+"点です。");
  }
}
