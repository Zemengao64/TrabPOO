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
public class InstituicaoFilantropica {
    
    private ArrayList</*Beneficiario*/Integer> beneficiarios = new ArrayList<>();
    private ArrayList</*Produto*/Integer> estoque = new ArrayList<>();
    private ArrayList</*EmpresaDoadora*/Integer> empresasDoadoras = new ArrayList<>();
    private ArrayList</*Historico*/Integer> historico = new ArrayList<>();
    
    //cadastra nova empresa doadora
    public void cadastraPessoa(/*EmpresaDoadora*/Integer pessoa){
        empresasDoadoras.add(pessoa);
    }
    
    //cadastra beneficiario novo
    public void addBeneficiario(/*Beneficiario*/Integer beneficiario){
        beneficiarios.add(beneficiario);
    }
    
    //exclui beneficiario do cadastro
    public void excluiBeneficiario(/*Beneficiario*/Integer beneficiario){
        beneficiarios.remove(beneficiario);
    }
    
    //atualiza o estoque da instituição com o que foi disponibilizado pela empresa em questão
    public void atualizaEstoque(EmpresaDoadora empresa){
        estoque.addAll(empresa.getProdutosParaDoacao());
    }
    
    //printa o estoque
    public void mostraEstoque(){
        System.out.println(this.getEstoque());
    }
    
    /**
     * @return the estoque
     */
    public ArrayList</*Produto*/Integer> getEstoque() {
        return estoque;
    }
}
