package Week03;

import java.util.Scanner;

public class Demo02 {
    //程序主入口(psvm/main)
    public static void main(String[] args) {
        //声明变量并初始化
        //长
        float height = 0.0f;
        //宽
        float width = 0.0f;
        //引用对象new Scanner().var
        //System.in:系统输入
        Scanner sc = new Scanner(System.in);
        //System.out:系统输出
        //print 打印不换行
        System.out.print("请输入长方形的长 ");
        //将长绑定给height(height为float类型,所以要用nextFloat接收)
        height = sc.nextFloat();
        //println:打印并换行
        System.out.println("请输入长方形的宽 ");
        //将宽的值绑定给width
        width = sc.nextFloat();

        //计算面积并将值赋给area
        float area = height * width;

        //打印结果
        //字符串拼接
        System.out.printf("长方形的面积为:%5f",area);

    }
}
