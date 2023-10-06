<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Remover Autor/title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
        <h1>Remover Autor</h1>
        <p>Tem certeza que deseja remover o autor "${autor.nome}" ?</p>
        <form action = "/autor/delete"  method ="post">
            <input type="hidden" name="id" value="${autor.id}"/>
            <br />
            <a href="/genero/list" class="btn btn-primary">Voltar</a>
            <button type="submit" class="btn btn-danger">Excluir</button>
            </form>
        </div>
             
             
    </div>
    </body>
</html>

