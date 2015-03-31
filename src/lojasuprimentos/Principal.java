/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojasuprimentos;

import java.util.Scanner;
import java.util.InputMismatchException.*;
/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        Scanner sc = new Scanner(System.in);
        
        int qtd;
        String desc,num;
        double preco,total = 0;
        
        System.out.printf("Digite o numero do produto: \n");
        num = sc.next();
        System.out.printf("Digite a descrição do produto: \n");
        desc = sc.next();
        System.out.printf("Digite a quantidade do produto: \n");
        qtd = sc.nextInt();
        System.out.printf("Digite o preço do produto: \n");
        preco = sc.nextDouble();
        
        fatura.setDescricao(desc);
        fatura.setNumero(num);
        fatura.setQtdItem(qtd);
        fatura.setPreco(preco);
        
        System.out.printf("Numero: "+ fatura.getNumero());
        System.out.printf("\nDescrição: "+ fatura.getDescricao());
        System.out.printf("\nQuantidade do Produto: " + fatura.getQtdItem());
        System.out.printf("\nPreço: " + fatura.getPreco()+"R$");
        
       if(fatura.getValorFatura(total)<=0)
        System.out.printf("\n\nFatura: %.0fR$\n",fatura.getValorFatura(total));
        else
           System.out.printf("\n\nFatura: "+ fatura.getValorFatura(total)+"R$\n");
    }
    
}
