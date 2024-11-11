package Week09;

public class SalaryIncome extends Income{
    //20%
    public SalaryIncome() {
    }

    public SalaryIncome(double money) {
        super(money);
    }

//    @Override
//    public void Taxes() {
//        double money = getMoney();
//        double taxes = money * 0.20;
//        System.out.printf("工资税需要交%.2f元\n",taxes);
//    }

    public String toString() {
        return "SalaryIncome{}";
    }

    @Override
    public double getTaxes() {
        double money = getMoney();
        double taxes = money * 0.20;
        System.out.printf("工资税需要交%.2f元\n",taxes);
        return taxes;

    }
}
