package Week10;

public class Person implements getCount{
    private String name;
    private int age;

    private static int count;
    private static int countStatic;

    public static void getCountStatic() {
        countStatic++;
        System.out.println("第"+countStatic+"个对象已创建!");
    }


    public Person() {
        getCountStatic();
        getCount();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        getCountStatic();
        getCount();
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }


    @Override
    public void getCount() {
        count++;
        System.out.println("第"+count+"个对象已创建:"+toString());
    }
}
