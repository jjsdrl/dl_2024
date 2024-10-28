package Week07;

public class Demo02 {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 12);
        Student s1 = new Student("小红", 18, 99);
        PrimaryStudent ps1 = new PrimaryStudent("小军", 9, 100, 1);
        System.out.println(ps1.getName()+","+ps1.getAge()+"岁,成绩为:"+ps1.getScore()+",排名为:"+ps1.getRank());

    }
}
