package Week08;

public class Cat extends Animal{

    @Override
    public String sound() {
        return "小猫"+super.getName()+super.sound()+"喵喵喵";
    }

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return super.getName();
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        super.setName(name);
    }

    public String toString() {
        return "Cat{name = " + super.getName() + "}";
    }
}
