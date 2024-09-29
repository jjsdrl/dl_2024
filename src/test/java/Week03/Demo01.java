package Week03;

public class Demo01 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        System.out.println(str1);
        String str2 = "abc";
        String str3 = "abc";
        String str4 = "a";
        String str5 = "b";
        String str6 = "c";
        String str7 = str4 + str5 + str6;

        System.out.println(str2 == str1);
        System.out.println(str2 == str3);
        System.out.println(str2 == str7);
    }
}
