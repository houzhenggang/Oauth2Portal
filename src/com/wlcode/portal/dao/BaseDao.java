package com.wlcode.portal.dao;

import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
    /**
     * �ر����ݿ�����
     * @param statement ���ݿ����� 
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
