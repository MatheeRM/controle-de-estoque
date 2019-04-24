/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.dao;

import java.sql.*;
/**
 *
 * @author admin
 */
public class ConnectionFactory {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/DBControleEstoque II";
    private static final String USER = "UserControleEstoque";
    private static final String PASS = "123456";
    
    public static Connection getConnection()
    {
        try
        {
            System.out.print("Conectado ao banco de dados!");
            return DriverManager.getConnection(URL, USER, PASS);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
  
    }
    
}
