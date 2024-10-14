package Week05;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //杨辉三角
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要几行杨辉三角");
        //行数/列数
        int count = sc.nextInt();
        //行数 = 列数
        //按照最长的列设置二维数组内一维数组的长度
        //一维数组内未赋值的补默认初始值
        int[][] arr = new int[count][count];
        //确定行
        for (int i = 0; i < count; i++) {
            //行里确定每一个元素的值

            //行号等于列里的元素个数
            //  2      2
            // i =1     j<2(0,1)
            for (int j = 0; j < i+1; j++) {
                //当j=0和i=0的时候(三角形上顶点,左边,右边),数组的元素值为1
                if (i==0 || j ==0){
                    arr[i][j] = 1;
                }else {
                    //在三角形内部时
                    //当前值   等于 上一行的前一个元素   加    上一行同列的元素
                    //ij       =     (i-1)(j-1)     +   (i-1)j
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                //\t:制表位
                System.out.print(arr[i][j]+"\t");
            }
            //当前行打印结束,换行
            System.out.println();
        }
    }
}
