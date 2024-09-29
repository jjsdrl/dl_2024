package Week04;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体重:");
        //将输入的值赋给变量
        double tz = sc.nextDouble();
        System.out.println("请输入你的身高:");
        //将输入的值赋给变量
        double sg = sc.nextDouble();
        //运算
        //Math.pow(变量或数值,次数)
        double BMI = tz / Math.pow(sg,2);
        System.out.println(BMI);
        //if判断
        if (BMI<18.5)
            System.out.println("过轻");
        else if (BMI>=18.5 && BMI<25)
            System.out.println("正常");
        else if (BMI>=25 && BMI<28)
            System.out.println("过重");
        else if (BMI>=28 && BMI <32)
            System.out.println("肥胖");
        else if (BMI >= 32)
            System.out.println("非常肥胖");

        System.out.printf("您的BMI值为:%2f",BMI);
    }
}
