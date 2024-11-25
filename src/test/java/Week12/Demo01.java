package Week12;

public class Demo01 {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3,10));
        String newStr1  =str.replace("q","p");
        System.out.println(newStr1);
        String newStr2 =str.replaceAll("i","L");
        System.out.println(newStr2);
        String[] parts = str.split("b");
        for (int i = 0; i < parts.length; i++) {
            str = parts[i];
            System.out.println(str);
        }
        String str1 = "  sfsdf  ";
        System.out.println(str1);
        String trimmed = str1.trim();
        System.out.println(trimmed);
    }
}
