package Week05;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //定义变量存储场数
        int count = 0;
        //定义变量存储获胜场次
        int wincount = 0;
        //导入Scanner对象
        Scanner sc = new Scanner(System.in);
        //导入Random对象
        Random r = new Random();
        while (true){
            if (count == 0 ) {
                System.out.println("欢迎来到猜拳小游戏");
                System.out.println("请猜拳:");
                System.out.println("1.石头");
                System.out.println("2.剪刀");
                System.out.println("3.布");
                System.out.println("4.退出");
                System.out.print("请输入你的选择:");
            }else {
                System.out.println();
                System.out.println("请猜拳:");
                System.out.println("1.石头");
                System.out.println("2.剪刀");
                System.out.println("3.布");
                System.out.println("4.退出");
                System.out.print("请输入你的选择:");
            }
            //输入的石头剪刀布
            int option = sc.nextInt();
            //获取程序随机出的石头剪刀布
            //0:石头
            //1:剪刀
            //2:布
            int bootOption = r.nextInt(3);
            /*
            System.out.println();
            if (bootOption == 0) {
                System.out.println("Boot:石头");
            }else if (bootOption == 1) {
                System.out.println("Boot:剪刀");
            }else if (bootOption == 2) {
                System.out.println("Boot:布");
            }
            */
            System.out.println();
            //判断是否取胜
            //1:胜利
            //0:平局
            //-1:失败
            //其他则结束程序
            int flag = caiQuan(option,bootOption);
            switch (flag){
                case -1:
                    count++;
                    System.out.println("再接再厉哦!!!");
                    break;
                case 0:
                    count++;
                    System.out.println("哇!平局诶!");
                    break;
                case 1:
                    wincount++;
                    count++;
                    System.out.println("欸嘿!太厉害了吧!!!");
                    break;
                default:
                    //退出
                    if (count == 0){
                        System.out.println("您真的要离开嘛?(y/n)");
                        String input = sc.next();
                        if (input.equals("y")) {
                            System.out.println("下次再见咯!!");
                            System.out.println("谢谢您的使用!!");
                            System.exit(0);
                        }else if (input.equals("n")) {
                            break;
                        }
                    }else if ( wincount == 0){
                        System.out.println("革命还未胜利,同志还需努力!");
                        System.exit(0);
                    }else {
                        System.out.println("您一共参加了"+count+"局,获胜了"+wincount+"局");
                        System.out.println("太厉害了吧!!!!");
                        System.exit(0);
                    }

            }

        }
    }

    //比对
    public static int caiQuan(int option,int bootOption){
        switch (option){
            case 1:
                if (bootOption == 0 ){
                    return 0;
                }else if (bootOption == 1 ){
                    return 1;
                }else if (bootOption == 2 ){
                    return -1;
                }
                break;
            case 2:
                if (bootOption == 0 ){
                    return -1;
                }else if (bootOption == 1 ){
                    return 0;
                }else if (bootOption == 2 ){
                    return 1;
                }
                break;
            case 3:
                if (bootOption == 0 ){
                    return 1;
                }else if (bootOption == 1 ){
                    return -1;
                }else if (bootOption == 2 ){
                    return 0;
                }
                break;
            default:
                return -2;
        }
        return -2;
    }

}
