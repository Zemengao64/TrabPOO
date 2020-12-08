/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.util.ArrayList;

/**
 *
 * @author bcipr
 */
public class EmpresaDoadora {
    
    private ArrayList</*Produto*/Integer> produtosParaDoacao = new ArrayList<>();

    /**
     * @return the produtosParaDoacao
     */
    public ArrayList</*Produto*/Integer> getProdutosParaDoacao() {
        return produtosParaDoacao;
    }

    /**
     * @param produtosParaDoacao the produtosParaDoacao to set
     */
    public void setProdutosParaDoacao(ArrayList</*Produto*/Integer> produtosParaDoacao) {      //substitui o que colocamos na planilha como doaProdutos();
        this.produtosParaDoacao = produtosParaDoacao;
    }
    
}
