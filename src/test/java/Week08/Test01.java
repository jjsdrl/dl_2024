package Week08;

public class Test01 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[]{
            new Cat("哆啦a梦"),
            new Dog("旺财"),
            new Cat("哆啦b梦")
    };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].sound());
        }
        Animal d1 = new Dog("旺财");
        System.out.println(d1.sound());
        Animal c1 = new Cat("哆啦c梦");
        System.out.println(c1.sound());
    }
}
