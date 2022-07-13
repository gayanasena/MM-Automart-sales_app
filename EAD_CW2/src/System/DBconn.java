/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconn {
    static final String db_url = "jdbc:mysql://localhost/sale_app";
    static final String db_username = "root";
    static final String db_password = "";
    
    static Connection conn = null;
    
    public static Connection getConn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, db_username, db_password);
        }
        catch(Exception ee)
        {
            System.out.println(ee.toString());
        }
        return conn;
    }
}
