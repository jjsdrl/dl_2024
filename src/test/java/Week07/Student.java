package Week07;

public class Student extends Person{
    protected int score;

    public Student() {
    }

    public Student(String name,int age,int score) {
        super(name,age);
        this.score = score;
    }

    /**
     * 获取
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Student{score = " + score + "}";
    }
}
