package Week06;

public class Demo02 {
    public static void main(String[] args) {
        City c1 = new City("江西",24.29,113.34);
        System.out.println(c1);
        City c2 = new City();
        c2.setName("北京");
        c2.setLatitude(39.56);
        c2.setLongitude(116.20);
        System.out.println(c2.getName()+"的纬度为:"+c2.getLatitude()+",经度为:"+c2.getLongitude());
    }
}
