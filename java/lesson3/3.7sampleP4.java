import java.io.*;

class sampleP4 {
  public static void main(String[] args) throws IOException {

    System.out.ptintln("円周率の値はいくつですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    String str = br.readLine();

    int pi = Integer.parseInt(str);

    System.out.println("円周率の値は"+pi+"です。");
    
  }
}
