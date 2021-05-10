/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.Models;

/**
 *
 * @author pedro.lins.sant.ana
 */
public class Livro {
    private int id;
    private int isbn;
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    private String genero;
    private boolean disponiblidade;

    public int getId() {
        return id;
    }

    public boolean isDisponiblidade() {
        return disponiblidade;
    }

    public void setDisponiblidade(boolean disponiblidade) {
        this.disponiblidade = disponiblidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }
    
    
    
}
