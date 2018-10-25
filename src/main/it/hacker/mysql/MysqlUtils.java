package it.hacker.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author wqh
 * @date 18-10-25
 */
public class MysqlUtils {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "Wuqihuan19950903";
    private static final String URL = "jdbc:mysql://localhost:3306/interviewtest?charset=utf8&useSSL=false";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("创建数据库对象失败");
        }
        return connection;
    }
}
