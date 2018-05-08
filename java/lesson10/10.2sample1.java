class sample1 {
  public static void main(String[] args) {
    String str = "Hello";

    //１番目の文字の取り出し
    char ch1 = str.charAt(0);
    //２番目の文字の取り出し
    char ch2 = str.charAt(1);
    //文字列の長さを返します
    int len = str.length();

    System.out.println(str+"の１番目の文字は"+ch1+"です。");
    System.out.println(str+"の２番目の文字は"+ch2+"です。");
    System.out.println(str+"の長さは"+len+"です。");
  }
}
