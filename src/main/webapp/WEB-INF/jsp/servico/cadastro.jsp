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
    <h2>Cadastramento de Serviço</h2>

        <form action="/servico/incluir" method="post">
            <c:import url="/WEB-INF/jsp/item/cadastro.jsp"/>
            <div class="mb-3 mt-3">
                <label>Tipo de Serviço:</label>
                <input type="text" class="form-control" placeholder="tipoServico" name="tipoServico">
            </div>
            <div class="mb-3 mt-3">
                <label>Rede Social:</label>
                <input type="text" class="form-control" placeholder="redeSocial" name="redeSocial">
            </div>
            <div class="mb-3 mt-3">
                <label>Nota de Avaliação:</label>
                <input type="text" class="form-control" placeholder="notaAvaliacao" name="notaAvaliacao">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>


</div>
</body>
</html>