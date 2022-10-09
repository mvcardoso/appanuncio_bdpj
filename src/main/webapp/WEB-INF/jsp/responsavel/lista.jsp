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
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">

    <c:if test="${not empty mensagem}">
    <div class="alert alert-info">
        <strong>Informação</strong> ${mensagem}
    </div>
    </c:if>
    <h2>AppAnuncio</h2>
    <p>Projeto de Gestão de Anúncios</p>

    <h3>Classe: Responsavel</h3>
    <a href="/responsavel">Novo</a>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Telefone</th>
            <th>Email</th>
            <th>Usuario</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${listagem}">
            <tr>
                <td>${a.id}</td>
                <td>${a.nome}</td>
                <td>${a.telefone}</td>
                <td>${a.email}</td>
                <td>${a.usuario.email}</td>
                <td><a href="/responsavel/${a.id}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>