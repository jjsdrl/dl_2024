package Week11;

public class outterTest {
    public static void main(String[] args) {
        Outter outter = new Outter();
        //内部类
        Outter.intter intter = outter.new intter();
        intter.display();
        //局部内部类
        outter.outDisplay();
        //静态内部类
        Outter.staticIntter staticIntter = new Outter.staticIntter();
        staticIntter.display();
        //匿名内部类
        Outter.noIntter noIntter = outter.new noIntter();
        noIntter.display();
    }
}
