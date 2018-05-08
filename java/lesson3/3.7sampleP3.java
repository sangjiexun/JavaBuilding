import java.io.*;

class sampleP2 {
  public static void main(String[] args) throws IOException {
    System.out.println("あなたは何歳ですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str = br.readLine();

    int age = Integer.parseInt(str);

    System.put.println("あなたは" + age + "歳です。");
  }
}
