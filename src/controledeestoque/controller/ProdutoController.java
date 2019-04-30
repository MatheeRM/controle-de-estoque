/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.controller;

import controledeestoque.dao.ProdutosDAO;
import controledeestoque.view.BaixarProdutosView;
import controledeestoque.view.InserirProdutosView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ProdutoController {

    public void Inserir(int id, int qtde) {

        try {
            ProdutosDAO produtosDAO = new ProdutosDAO();
            Integer quantidadeDeEstoque;
            quantidadeDeEstoque = produtosDAO.
                    buscarQuantidadeDeEstoque(id);
            if (quantidadeDeEstoque != null) {
                produtosDAO.atualizar(id, qtde + quantidadeDeEstoque);
                JOptionPane.showMessageDialog(null,
                        "Estoque atualizado", "Operação Confirmada",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Código Inválido", "Operação Incorreta",
                        JOptionPane.ERROR);
            }
            //limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(InserirProdutosView.class.getName()).
                    log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Código Inválido", "Operação Incorreta",
                    JOptionPane.ERROR);
        }
    }

    public void Baixar(int id, int qtde) {
        try {
            ProdutosDAO ProdutosDAO = new ProdutosDAO();
          Integer quantidadeDeEstoque;
          quantidadeDeEstoque = ProdutosDAO.
                  buscarQuantidadeDeEstoque(id);
            if (quantidadeDeEstoque != null) {
                ProdutosDAO.atualizar(id,
                        quantidadeDeEstoque - qtde);
                JOptionPane.showMessageDialog(null,
                        "Estoque atualizado", "Sucesso",
                        JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Código inválido", "Erro",
                        JOptionPane.ERROR);
            }
            //limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(BaixarProdutosView.
                    class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Digite valores numéricos", "Erro",
                    JOptionPane.ERROR);
        }
    }
}

        

