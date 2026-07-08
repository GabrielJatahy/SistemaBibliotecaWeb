
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>
        Cadastro de Livro
    </title>

    <link rel="stylesheet" href="css/style.css">

</head>


<body>


<div class="container">


<h2>
    Cadastro de Livro
</h2>



<form action="../livro" method="post">


    Título:

    <br>

    <input type="text" 
           name="titulo" 
           required>


    <br><br>



    Autor:

    <br>

    <input type="text" 
           name="autor" 
           required>


    <br><br>



    Ano de publicação:

    <br>

    <input type="number" 
           name="ano" 
           required>


    <br><br>



    ISBN-13:

    <br>

    <input type="text"
           name="isbn"
           minlength="13"
           maxlength="13"
           pattern="[0-9]{13}"
           placeholder="Digite 13 números"
           required>


    <br><br>



    <button type="submit">
        Cadastrar
    </button>


</form>



<br>



<a href="lista.jsp">
    Ver livros cadastrados
</a>



<br><br>



<a href="../index.jsp">
    Voltar ao início
</a>



</div>


</body>

</html>

