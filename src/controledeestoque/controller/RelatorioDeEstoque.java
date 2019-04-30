/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.controller;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;

/**
 *
 * @author admin
 */
public class RelatorioDeEstoque {
    private String local;
    private PdfPTable table;

public RelatorioDeEstoque(String local) {
    this.local = local;
    this.table = new PdfPTable(3);
}
public void imprimeTitulo(String linha) {
    PdfPCell cellcodigo, cellestoque,
            celldescricao, celltitulo, cellbranco;
    cellbranco = new PdfPCell(new Paragraph(" "));
    
}
    
}

    

