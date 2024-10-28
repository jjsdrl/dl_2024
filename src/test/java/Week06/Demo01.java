package Week06;

public class Demo01 {
    public static void main(String[] args) {
        //创建Person对象并且直接赋值
        Person p1 = new Person("向冰",20);
        //创建对象
        Person p2 = new Person();
        //调用对应的方法给p2对象赋值
        p2.setName("向冰");
        p2.setAge(18);
        //调用方法获取对象对应的值
//        String p2Name = p2.getName();
        System.out.println(p2.getName()+p2.getAge());
        //打印对象,默认调用对象的toString方法
        System.out.println(p1);
        //调用toString()方法打印数据
//        System.out.println(p2.toString());
//        Person p3 = new Person();
//        p3.setAge(18);
//        System.out.println(p3.toString());

    }
}
