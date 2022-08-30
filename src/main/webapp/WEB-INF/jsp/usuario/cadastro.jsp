<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppAnuncio</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/automovel/lista">Automovel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/imovel/lista">Imovel</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/servico/lista">Serviço</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/anuncio/lista">Anuncio</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/responsavel/lista">Responsavel</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">
    <h2>Cadastramento de usuários</h2>

        <h2>Stacked form</h2>
        <form action="/usuario/incluir" method="post">
            <div class="mb-3 mt-3">
                <label>Nome:</label>
                <input type="email" class="form-control" placeholder="Entre com o seu nome" name="nome">
            </div>
            <div class="mb-3 mt-3">
                <label>Email:</label>
                <input type="email" class="form-control" placeholder="Entre com o seu email" name="email">
            </div>
            <div class="mb-3">
                <label>Password:</label>
                <input type="password" class="form-control" placeholder="Digite a senha" name="senha">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>


</div>
</body>
</html>