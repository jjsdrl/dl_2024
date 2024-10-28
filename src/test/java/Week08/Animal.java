package Week08;

public class Animal {
    private String name;


    public String sound(){
        return "正在发出声音!";
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
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

    public String toString() {
        return "Animal{name = " + name + "}";
    }
}
