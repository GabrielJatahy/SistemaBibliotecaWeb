
<%@ page contentType="text/html;charset=UTF-8" %>

<%@ page import="model.Livro" %>
<%@ page import="model.LivroDAO" %>
<%@ page import="java.util.List" %>


<!DOCTYPE html>
<html>


<head>

    <meta charset="UTF-8">

    <title>
        Lista de Livros
    </title>


    <link rel="stylesheet" href="css/style.css">


</head>



<body>


<div class="container">


<h2>
    Livros Cadastrados
</h2>




<table>


<tr>

    <th>ID</th>

    <th>Título</th>

    <th>Autor</th>

    <th>Ano</th>

    <th>ISBN-13</th>

    <th>Ação</th>

</tr>



<%

LivroDAO dao = new LivroDAO();

List<Livro> livros = dao.listar();


for(Livro livro : livros) {

%>



<tr>


    <td>
        <%= livro.getId() %>
    </td>



    <td>
        <%= livro.getTitulo() %>
    </td>



    <td>
        <%= livro.getAutor() %>
    </td>



    <td>
        <%= livro.getAno() %>
    </td>



    <td>
        <%= livro.getIsbn() %>
    </td>



    <td>

        <a href="../livro?id=<%= livro.getId() %>">

            Excluir

        </a>

    </td>


</tr>



<%

}

%>



</table>



<br>



<a href="cadastro.jsp">

    Cadastrar novo livro

</a>



<br><br>



<a href="../index.jsp">

    Voltar ao início

</a>



</div>



</body>


</html>