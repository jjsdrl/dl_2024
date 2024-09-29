package Week02;

public class demo02 {
    public static void main(String[] args) {
        int a = 19216811;
        int c = 192168120;
        System.out.println(a ^ c);
        System.out.println(a & c);
        System.out.println(a | c);
        System.out.println("===========================");

        int n = 7;
        System.out.println(n << 1);
        System.out.println(n >> 2);


        System.out.println("===========================");

        System.out.println(n >10 ?true:false);

        System.out.println("===========================");
        int age = 12;
        boolean isZero = age==0;
        boolean isNoZero = !isZero;
        boolean isAdult = age >= 18;
        System.out.println(isAdult);
        System.out.println(isNoZero);
        System.out.println(isZero);

        System.out.println("===========================");

        System.out.println("===========================");
    }
}
