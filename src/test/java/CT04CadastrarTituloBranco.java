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
public class CT04CadastrarTituloBranco extends junit.framework.TestCase {
    
    public CT04CadastrarTituloBranco() {
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
    public void testCadastrarTituloBranco(){
        
        String titulo = "";
        int isbn = 1234;
        String gen = "DRAMA";
        String autor = "TESTE";
        
        Livro livro = new Livro();
        
        livro.setTitulo(titulo);
        livro.setIsbn(isbn);
        livro.setGenero(gen);
        
        List<Livro> retornoEsperado = null;
        
        
        List retorno = LivroService.cadastrarLivro(titulo, isbn, gen, autor);
        
        
        assertEquals(retornoEsperado, retorno);
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
