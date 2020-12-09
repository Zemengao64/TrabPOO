# TrabPOO

package com.mycompany.trabalhofinal;

import java.io.Serializable;

/**
 *
 * @author Belmont
 */
public class Pessoa implements Serializable {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public Pessoa (){
        
    }
    
    public Pessoa (String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void cadastraPessoa(){
    
    }
    
    public void atualizaCadastro(){
    
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
            
    public String fetEmail(){
        return this.email;
    }
}

===============================================================


package com.mycompany.trabalhofinal;

import java.io.Serializable;

/**
 *
 * @author Belmont
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String representante;
    
    
   public PessoaJuridica (){
       
   }
   
   public PessoaJuridica (String nome, String endereco, String telefone, String email, String cnpj, String representante){
       super (nome, endereco, telefone, email);
       this.cnpj = cnpj;
       this.representante = representante;
   }
   
   public String getCnpj (){
       return this.cnpj;
   }
           
   public String getRepresentante (){
       return this.representante;
   }
}
