package Week05;

public class Demo05 {
    public static void main(String[] args) {
        String[] str = new String[]{"zhy", "xb", "dhy"};
        String s = str[1];
        str[1] = "ll";
        System.out.println(str[1]);
        System.out.println(s);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
