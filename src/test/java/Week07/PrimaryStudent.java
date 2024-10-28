package Week07;

public class PrimaryStudent extends Student{
    protected int rank;

    public PrimaryStudent() {
    }

    public PrimaryStudent(String name,int age,int score,int rank) {
        super(name,age,score);
        this.rank = rank;
    }

    /**
     * 获取
     * @return rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * 设置
     * @param rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return "PrimaryStudent{rank = " + rank + "}";
    }
}
