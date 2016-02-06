package com.wlcode.portal.dao;

import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
    /**
     * 关闭数据库声明
     * @param statement 数据库声明 
     */
    public void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch(SQLException e) {
            
        }
    }
}
