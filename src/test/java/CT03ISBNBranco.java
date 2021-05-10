/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import biblioteca.Models.Livro;
import biblioteca.Service.LivroService;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedro.lins.sant.ana
 */
public class CT03ISBNBranco extends junit.framework.TestCase {
    
    public CT03ISBNBranco() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testISBNBranco(){
        
        String nome = "TESTE";
        int isbn = 2345;
        String gen = "DRAMA";
        String autor  = "TESTE";
        
        Livro livro = new Livro();
        
        livro.setTitulo(nome);
        livro.setIsbn(isbn);
        livro.setGenero(gen);
        
        List retorno = LivroService.cadastrarLivro(nome, isbn, gen, autor);
        
        List<Livro> retornoEsperado = new ArrayList<>();
        retornoEsperado.add(livro);
        
        retorno = LivroService.cadastrarLivro(nome, isbn, gen, autor); 
        
        assertArrayEquals(retorno.toArray(), retornoEsperado.toArray());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
