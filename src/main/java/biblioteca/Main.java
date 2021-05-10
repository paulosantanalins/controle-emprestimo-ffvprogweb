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
        System.out.println("2 - CONSULTAR DISPONIBILIDADE");
        System.out.println("ESCOLHA UMA OPCAO: ");
        Scanner keyboard = new Scanner(System.in);
        int result = keyboard.nextInt();
        
        switch(result){
            case 1:
                System.out.println("Digite o nome do Livro: ");
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
                break;
            case 2:
                consultarDisponiblidadeLivros();
                break;
        }
        
    }
    
    
    
    
    
    private static void consultarDisponiblidadeLivros(){
        
        /*
        System.out.println("LIVROS DISPONIVEIS PARA EMPRESTIMO: ");
        
        for(Livro livro : livros){
            if(livro.isDisponiblidade()){
                System.out.println("NOME: " + livro.getNome());
                System.out.println("ISBN: " + livro.getIsbn());
                System.out.println("NOME: " + livro.getNome());
            }
        }
        
        menu();;

        */
    }
    
}
