<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Editar Livro/title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
        <h1>Editar Livro</h1>
        <form action = "/livro/update"  method ="post">
            <input type="hidden" name="id" value ="${livro.id}"/>
            <div class= "form-group">
            <label form="nome"> Nome: </label>
            <input type="text" name="nome" class="form-control" value="${livro.nome}"/>

        </div>
        <br/>
        
                        <a href ="/livro/list" class ="btn btn-primary">Voltar</a>
                        <button type="submit" class="btn btn-sucess">Salvar</button>
    </form>
    </div>
    </body>
</html>

