<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Livros</title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
        <h1>Livros</h1>
        <a href ="/livro/insert" class="btn btn-primary"> Novo Livro</a>
        <table class ="table">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>&nbsp;</th> 
            </tr>
            <c:forEach var="item" items="${livros}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.nome}</td>
                    <td>
                        <a href ="/livro/update?id=${item.id}" class ="btn btn-warning">Editar</a>
                        <a href ="/livro/delete?id=${item.id}" class ="btn btn-danger">Excluir</a>
                    </td>
                </tr>

            </c:forEach>

        </table>
    </div>
    </body>
</html>

