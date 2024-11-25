package Week12;

public class Demo02 {
    public static void main(String[] args) {
        String[] fields = {"name","position","salary"};
        String table = "employee";
        String insert = buildInsertSql(table,fields);
        System.out.println("insert:"+insert);
        String s = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)";
        System.out.println(s.equals(insert)?"测试成功":"测试失败");

    }

    private static String buildInsertSql(String table, String[] fields) {
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //循环取值
        for (int i = 0; i < fields.length; i++) {
            if (i == 0) {
                //第一次的时候添加前面的内容
                sb.append("INSERT INTO ").append(table).append(" (").append(fields[i]).append(",");
            }
            else if (i == fields.length - 1) {
                //最后一次添加后面的内容
                sb.append(fields[i]).append(") VALUES (?,?,?)");
            }else {
                //中间内容的格式
                sb.append(fields[i]).append(",");
            }
        }
        //返回字符串内容
        return new String(sb);
    }
}
