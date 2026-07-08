
package controller;


import model.Livro;
import model.LivroDAO;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/livro")

public class LivroServlet extends HttpServlet {


    private LivroDAO dao = new LivroDAO();



    // Cadastro de livro

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {



        String titulo = request.getParameter("titulo");

        String autor = request.getParameter("autor");

        String anoStr = request.getParameter("ano");

        String isbn = request.getParameter("isbn");




        // Validação dos campos

        if (titulo == null || titulo.isEmpty()
                || autor == null || autor.isEmpty()
                || anoStr == null || anoStr.isEmpty()
                || isbn == null || isbn.isEmpty()) {


            response.sendRedirect("WebContent/cadastro.jsp");

            return;

        }




        // Validação ISBN-13

        if (!isbn.matches("[0-9]{13}")) {


            response.sendRedirect("WebContent/cadastro.jsp");

            return;

        }





        Livro livro = new Livro();



        livro.setTitulo(titulo);

        livro.setAutor(autor);

        livro.setAno(Integer.parseInt(anoStr));

        livro.setIsbn(isbn);




        dao.adicionar(livro);




        response.sendRedirect("WebContent/lista.jsp");


    }






    // Exclusão de livro

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {



        String id = request.getParameter("id");



        if(id != null && !id.isEmpty()) {


            dao.excluir(Integer.parseInt(id));


        }



        response.sendRedirect("WebContent/lista.jsp");


    }



}

