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
public class Historico {
    
    private final String data;
    private final /*Beneficiario*/Integer beneficiario;
    private ArrayList</*Produto*/Integer> produtos = new ArrayList<>();
    
    public Historico(String data, /*Beneficiario*/Integer beneficiario, ArrayList</*Produto*/Integer> produtos){
        this.data = data;
        this.beneficiario = beneficiario;
        this.produtos = produtos;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @return the beneficiario
     */
    public Integer getBeneficiario() {
        return beneficiario;
    }
    
}
