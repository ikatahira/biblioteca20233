<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Novo Livro/title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
        <h1>Novo Livro</h1>
        <form action="/livro/insert"  method ="post">
        <div class= "form-group">
            <label for="nome"> Nome: </label>
            <input type="text" name="nome" class="form-control"/>

        </div>
        <br/>
        
                        <a href ="/livro/list" class ="btn btn-primary">Voltar</a>
                        <button type="submit" class="btn btn-sucess">Salvar</button>
    </form>
    </div>
    </body>
</html>

