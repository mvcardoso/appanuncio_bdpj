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
    <h2>AppAnuncio</h2>
    <p>Projeto de Gestão de Anúncios</p>

    <h3>Classe: Serviço</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Preco</th>
            <th>Descricao Completa</th>
            <th>Tipo de Serviço</th>
            <th>Site/Rede Social</th>
            <th>Avaliação</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${listagem}">
            <tr>
                <td>${a.id}</td>
                <td>${a.preco}</td>
                <td>${a.descricaoCompleta}</td>
                <td>${a.tipoServico}</td>
                <td>${a.redeSocial}</td>
                <td>${a.notaAvaliacao}</td>
                <td><a href="/servico/${a.id}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>