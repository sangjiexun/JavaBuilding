import java.io.*;

class sampleP4 {
  public static void main(String[] args) throws IOException {
    System.out.println("三角形の高さと底辺を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    double height = (double)num1;
    double length = (double)num2;

    double area = height * length / 2;

    System.out.println("三角形の面積は"+area+"です。");

  }
}
