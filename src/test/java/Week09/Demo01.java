package Week09;

public class Demo01 {
    public static void main(String[] args) {
        Income[] income = new Income[]{new SalaryIncome(6000.0),new RoyaltyIncome(8000.0)};
        double total= 0;
        for (int i = 0; i < income.length; i++) {
            total = total + income[i].getTaxes();
        }
        System.out.println("一共要交:"+total+"元的税");
//        SalaryIncome si1 = new SalaryIncome(3999.00);
        
//        si1.Taxes();
//        si1.getTaxes();
//        RoyaltyIncome ri1 = new RoyaltyIncome(1999.00);
//        ri1.Taxes();
//        ri1.getTaxes();

    }
}
