package com.adsi.dao.patrondao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/ensayapp_db";
    private final String USER = "root";
    private final String PASS = "";
        
    public Connection conectar() throws Exception{
        try{
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            return conexion;
        }catch(SQLException e){
            throw e;
        }
    }
    
}
