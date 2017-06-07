package com;

/**
 * Created by Regina on 05.06.2017.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBHelper {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/questroom";

    private static final String USER = "root";
    private static final String PASS = "root";

    public Connection conn = null;
    public PreparedStatement stmt = null;

    public DBHelper() {

        try {
            Class.forName(JDBC_DRIVER);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void open() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER,PASS);

        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
