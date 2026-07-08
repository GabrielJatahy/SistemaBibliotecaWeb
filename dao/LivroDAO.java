package model;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private static List<Livro> livros = new ArrayList<>();
    private static int contador = 1;

    public void adicionar(Livro livro) {

        livro.setId(contador++);

        livros.add(livro);
    }

    public List<Livro> listar() {
        return livros;
    }

    public void excluir(int id) {
        livros.removeIf(l -> l.getId() == id);
    }
}