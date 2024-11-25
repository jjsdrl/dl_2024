package Week11;

//外部类
public class Outter {

    private String str = "外部字符串";

    //成员内部类
    class intter {
        void display() {
            System.out.println("这是成员内部类访问:" + str);
        }
    }

    private static String staticStr = "外部类字段";

    //静态内部类
    static class staticIntter{
        void display(){
            System.out.println("静态内部类访问"+staticStr);
        }
    }

    //局部内部类
    void outDisplay(){
        class partIntter{
            void display(){
                System.out.println("局部内部类访问:"+str);
            }
        }
        new partIntter().display();
    }

    //匿名内部类
    class noIntter{
       void display(){
           Animal animal = new Animal() {
               @Override
               public void play() {
                   System.out.println("这是匿名内部类");
               }
           };
           animal.play();
       }

    }
}