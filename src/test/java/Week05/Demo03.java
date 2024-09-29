package Week05;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        //接收第一个数
        int n = sc.nextInt();
        System.out.println("请输入第二个数");
        //接收第二个数
        int m = sc.nextInt();
        //和
        int sum = 0;
        System.out.print(n+"到"+m+"的和为:");
        //循环:当n大于m的时候终止循环
        while (n<=m){
            //累加
            sum+=n;
            //n自增
            n++;
        }
        //不换行打印
        System.out.println(sum);
    }
}
