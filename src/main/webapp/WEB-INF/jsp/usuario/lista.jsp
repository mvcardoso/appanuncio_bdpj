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
    <h2>AppAnuncio</h2>
    <p>Projeto de Gestão de Anúncios</p>

    <h3>Usuário</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Email</th>
            <th>Senha</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="u" items="${listagem}">
            <tr>
                <td>${u.nome}</td>
                <td>${u.email}</td>
                <td>${u.senha}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>