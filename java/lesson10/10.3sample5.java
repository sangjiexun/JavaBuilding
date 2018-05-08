//最大値を求める
import java.io.*;

class sample5 {
  public statuc void main(String[] args) throws IOException {
    System.out.println("整数を２つ入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    int ans = Math.max(num1,num2);

    System.out.println(num1+"と"+num2+"のうち大きい方は"+ans+"です。");
  }
}
