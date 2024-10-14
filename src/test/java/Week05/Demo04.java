package Week05;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //圆周率

        double pi1 = 0;
        double pi ;
        for (int i = 0; i < 100000000; i++) {
            //-1^n
            pi1 += (Math.pow(-1,i) / (2*i+1));

        }
        pi =  pi1 *4;
        System.out.println(pi);





//        //往后推算几个数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        double sum = 0.0;
//        double num = 0.0;
//        //字符串
//        String str = null ;
//        for (int i = 0; i < n; i++) {
//            num = (1.0/(i*2 +1));
//            if ( i % 2 == 0) {
//                if (i == 0){
//                    str =(i*2 +1)+ "";
//                }else {
//                    str = str + " + "+"1/"+(i*2 +1);
//                }
//
//
//                sum = sum + num;
//
//            }else{
//                num = (1.0/(i*2 +1));
//                str = str + " - "+"1/"+(i*2 +1);
//                sum = sum - num;
//            }
//        }
//
//        sum *=4;
//        System.out.println(str+"的结果为:");
//        System.out.printf("%.15f%n",sum);

    }
}
