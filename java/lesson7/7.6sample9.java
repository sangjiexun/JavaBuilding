import java.io.*;

class sample9 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(String.in));

    int[] test = new int[5];
    System.out.println(test.length+"人の点数を入力してください。");

    for (int i=0; i<test.length; i++) {
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    for (int s = 0; s < test.length; s++) {
      for (int t=s+1; t<test.length; t++) {
        if (test[t] > test[s]) {
          int tmp = test[t];
          test[t] = test[s];
          test[s] = tmp;
        }
      }
    }
  }
}
