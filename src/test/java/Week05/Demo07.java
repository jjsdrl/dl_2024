package Week05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //冒泡排序
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("请输入第"+(i+1)+"个元素的值:");
            arr[i] = sc.nextInt();
        }
        System.out.println("排序前:");
        //遍历
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


        //array对象提供的排序方法
//        Arrays.sort(arr);

        //一共count个元素所以需要count-1次
        //倒数第二次排序决定了倒数第二个数的位置,最后一个值不需要挪位
        for (int i = 0; i < count-1; i++) {
            //每一次取一个值在 count-1次停下 (在count次停下的话,j+1溢出报错)
            //每循环完一次确定一个值的位置-i(最大的值已经放置在最后了,前面的所有值都比 count - i - 1 的值小,无需再次判断)
            for (int j = 0; j < count - i -1 ; j++) {
                //如果当前值比后一个值大
                //调换两个值的位置
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后:");
        //遍历
        for (int n : arr) {
            System.out.print(n + "\t");
        }

    }
}
