package it.hacker.mysql;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 关于MySQL的问题
 * 问题一:创建表的SQL语句,当时是给了两张表,叫我创建表.
 *
 * @author wqh
 * @date 18-10-25
 */
public class MysqlCreateTable {




    public static int createTable(String sql) {
        Connection connection = MysqlUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("创建表失败");
        }
    }

    public static void main(String[] args) {
        String sql = "create table if not exists" +
                " user_test (user_id int(11) not null auto_increment," +
                "user_name varchar(32) not null," +
                "primary key(`user_id`)," +
                "key `index_user_name` (`user_name`));";
        int table = createTable(sql);
        if (table==0) {
            System.out.println("创建表成功");
        }

    }


}
