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
    <h2>Cadastramento de Imovel</h2>

        <form action="/imovel/incluir" method="post">
            <c:import url="/WEB-INF/jsp/item/cadastro.jsp"/>
            <div class="mb-3 mt-3">
                <label>Tipo de Imovel:</label>
                <input type="text" class="form-control" placeholder="tipoImovel" name="tipoImovel">
            </div>
            <div class="mb-3 mt-3">
                <label>Cidade:</label>
                <input type="text" class="form-control" placeholder="cidade" name="cidade">
            </div>
            <div class="mb-3 mt-3">
                <label>Area:</label>
                <input type="text" class="form-control" placeholder="area" name="area">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
</div>
</body>
</html>