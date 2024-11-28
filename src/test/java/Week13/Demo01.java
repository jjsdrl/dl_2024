package Week13;

import java.util.StringJoiner;

public class Demo01 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("1");
        sj.add("2");
        sj.add("3");
        sj.add("4");
        System.out.println(sj);
        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("a");
        sj1.add("b");
        sj1.add("c");
        sj1.add("d");
        System.out.println(sj1);
        sj1.merge(sj);
        System.out.println(sj1);
        sj.merge(sj1);
        System.out.println(sj);
    }
}
