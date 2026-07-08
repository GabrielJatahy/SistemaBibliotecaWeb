package jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroJSF {

    private String titulo;
    private String autor;
    private int ano;
    private String isbn;


    public void salvar() {

        System.out.println("Livro cadastrado pelo JSF:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("ISBN: " + isbn);

    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}