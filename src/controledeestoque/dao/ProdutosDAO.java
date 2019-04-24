/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class ProdutosDAO {
    Connection conn;
    
    public ProdutosDAO(){
        conn = ConnectionFactory.getConnection();
    }
    
    public void atualizar(int id, int qtde) throws SQLException {
        String sql = "UPDATE Produtos SET quantidade = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, qtde);
        pstmt.setInt(2, id);
        pstmt.execute();
        pstmt.close();
    }
    public Integer buscarQuantidadeDeEstoque(int id){
        try{
            String sql = "Select quantidade from produtos where id = ?";
            PreparedStatement pstmt = conn.prepareCall(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("quantidade");
            }
            pstmt.close();
            return null;
            }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
        
        public ResultSet buscarTodosProdutos() {
            try{
                String sql = "SELECT * FROM produtos";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                return rs;
            }
            catch(SQLException e)
            {
                throw new RuntimeException(e);
            }
            
        }
        
}

            
        
    

