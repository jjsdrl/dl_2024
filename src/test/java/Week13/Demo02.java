package Week13;


import java.util.StringJoiner;

public class Demo02 {
    public static void main(String[] args) {
        String[] fields = {"name","position","salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println("insert:"+insert);
        String s = "select name,position,salary from employee";
        System.out.println(s.equals(insert)?"测试成功":"测试失败");
    }

    private static String buildInsertSql(String table, String[] fields) {
        StringJoiner sj1 = new StringJoiner(" ");
        StringJoiner sj2 = new StringJoiner(",");
        for (int i = 0; i < fields.length; i++) {
            sj2.add(fields[i]);
        }
        sj1.add("select").merge(sj2).add("from").add(table);

        //返回字符串内容
        return String.valueOf(sj1);
    }
}
