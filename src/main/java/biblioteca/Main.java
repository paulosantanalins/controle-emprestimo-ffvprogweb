/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.Models.Livro;
import biblioteca.Service.LivroService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedro.lins.sant.ana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("BEM VINDO!");
        menu();
        
    }
    
    
    private static void menu(){
        System.out.println("1 - CADASTRAR LIVROS");
        System.out.println("2 - CONSULTAR DISPONIBILIDADE DE TODOS OS LIVROS");
        System.out.println("9 - SAIR");
        
        System.out.println("ESCOLHA UMA OPCAO: ");
        Scanner keyboard = new Scanner(System.in);
        int result = keyboard.nextInt();
        
        switch(result){
            case 1:
                String resposta = "S";
                
                do{
                    
                    System.out.println("Digite o titulo do Livro: ");
                    keyboard = new Scanner(System.in);
                    String nome = keyboard.nextLine();

                    System.out.println("Digite o ISBN do Livro: ");
                    keyboard = new Scanner(System.in);
                    int isbn = keyboard.nextInt();

                    System.out.println("Digite o genero do Livro: ");
                    keyboard = new Scanner(System.in);
                    String genero = keyboard.nextLine();

                    System.out.println("Digite o autor do Livro: ");
                    keyboard = new Scanner(System.in);
                    String autor = keyboard.nextLine();
                
                    
                    LivroService.cadastrarLivro(nome, result, genero, autor);
                    
                    System.out.println("Deseja cadastrar outro livro? (S/N)");
                    keyboard = new Scanner(System.in);
                    resposta = keyboard.nextLine();
                    
                }while(resposta.equals("S"));
                
                menu();
                break;
            case 2:
                LivroService.disponiblidade();
                menu();
                break;
            case 9:
                break;
        }
        
    }
    
    
}
