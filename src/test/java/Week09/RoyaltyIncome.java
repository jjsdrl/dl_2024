package Week09;

public class RoyaltyIncome extends Income{


    //15%
    public RoyaltyIncome() {
    }

    public RoyaltyIncome(double money) {
        super(money);
    }
//
//    @Override
//    public void Taxes() {
//        double money = getMoney();
//        double taxes = money * 0.15;
//        System.out.printf("稿费税需要交:%.2f元\n", taxes);
//    }

    @Override
    public double getTaxes() {
        double money = getMoney();
        double taxes = money * 0.15;
        System.out.printf("稿费税需要交:%.2f元\n", taxes);
        return taxes;
    }
}
