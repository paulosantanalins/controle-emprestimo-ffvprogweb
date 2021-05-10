/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Service;

import biblioteca.Models.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedro.lins.sant.ana
 */
public class LivroService {
    
    
    private static List<Livro> livros = new ArrayList<Livro>();
    
    
    public static List<Livro> cadastrarLivro(String titulo, int isbn, String genero, String autor){
       
            
            try{
                
                if(titulo != null && !titulo.trim().isEmpty() && isbn > 0){
                    Livro livro = new Livro();

                    livro.setTitulo(titulo);
                    livro.setGenero(genero);
                    livro.setIsbn(isbn);
                    livro.setAutor(autor);
                    livro.setDisponiblidade(true);

                    if(!existeISBN(isbn))
                        livros.add(livro);

                    return livros;
                }
                
                return null;
            }catch(Exception e){
                return null;
            }
           
        
    }
    
    public static void disponiblidade(){
        for(Livro livro:livros){
            if(livro.isDisponiblidade()){
                System.out.println("LIVROS DISPONIVEIS PARA EMPRESTIMO: ");
                System.out.println("TITULO: " + livro.getNome());
                System.out.println("AUTOR: " + livro.getAutor());
                System.out.println("GENERO: "  + livro.getGenero());
                System.out.println("\n");
            }
        }
        
        for(Livro livro:livros){
            if(!livro.isDisponiblidade()){
                System.out.println("LIVROS INDISPONIVEIS PARA EMPRESTIMO: ");
                System.out.println("TITULO: " + livro.getNome());
                System.out.println("AUTOR: " + livro.getAutor());
                System.out.println("GENERO: "  + livro.getGenero());
                System.out.println("\n");
            }
        }
    }
    
    
    private static boolean existeISBN(int isbn){
        
        if(livros.size() > 0){
            for(int i=0; i <= livros.size(); i++){
                int retorno = livros.get(i).getIsbn();

                if(retorno == isbn){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
