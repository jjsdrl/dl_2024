package Week09;

public abstract class Income implements IncomeIm{
    private double money;

    //交税
//    public abstract void Taxes();

    public Income() {
    }

    public Income(double money) {
        this.money = money;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Income{money = " + money + "}";
    }
}
