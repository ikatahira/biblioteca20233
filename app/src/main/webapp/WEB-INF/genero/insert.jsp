<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Novo Gênero/title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container"></div>
        <h1>Gêneros</h1>
        <form action = "/genero/insert"  method ="post"></form>
        <div class= "form-group">
            <label form="nome"> Nome: </label>
            <input type="text" name="nome" class="form-control"/>

        </div>
        <br/>
        
                        <a href ="/genero/list" class ="btn btn-primary">Voltar</a>
                        <button type="submit" class="btn btn-sucess">Salvar</button>
    </form>
    </div>
    </body>
</html>

