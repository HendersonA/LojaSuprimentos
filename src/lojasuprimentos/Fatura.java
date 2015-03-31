/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojasuprimentos;

/**
 *
 * @author Asus
 */
public class Fatura {
    private String numero;
    private String descricao;
    private  int qtdItem;
    private double preco;
    
    
    public String getNumero(){    
        return this.numero;
    }
    public String getDescricao(){
        return this.descricao;        
    }
    public int getQtdItem(){
        return this.qtdItem;
    }
    public double getPreco(){
        return this.preco;
    }
    public String setNumero(String numero){
        this.numero = numero;
        return numero;
    }
    public String setDescricao(String descricao){
        this.descricao = descricao;
        return descricao;
    }
    public int setQtdItem(int qtdItem){
        this.qtdItem = qtdItem;
        return qtdItem;
    }
    public double setPreco(double preco){
        this.preco = preco;
        return preco;
    }
    public double getValorFatura(double fatura){
       
        if(preco<0)
             preco=0.0f;
        
        fatura = this.preco*this.qtdItem;
         
        if(fatura<0){
            fatura=0;
        }
            return fatura;  
    }
    
}
