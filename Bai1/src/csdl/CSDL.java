package csdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
//    private static final String DATABASE_NAME = "bai1";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "";

    private final static String hostName = "localhost";
    private final static String userName = "root";
    private final static String password = "";
    private final static String dbName = "bai1";
    private final static String connectionUrl = "jdbc:mysql://"+hostName+":3306/"+dbName;
    public static Connection getConnection() {
        Connection conn = null;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionUrl, userName, password);
            if(conn!=null){
                return conn;
            }
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return conn;
    }
}
