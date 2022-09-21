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
    <h2>Cadastramento de Automóvel</h2>

        <form action="/automovel/incluir" method="post">
            <c:import url="/WEB-INF/jsp/item/cadastro.jsp"/>
            <label>Garantia:</label>
            <div class="radio">
                <label><input type="radio" name="garantia" value="true">Sim</label>
            </div>
            <div class="radio">
                <label><input type="radio" name="garantia" value="false" checked>Não</label>
            </div>

            <div class="mb-3 mt-3">
                <label>Marca:</label>
                <input type="text" class="form-control" placeholder="marca" name="marca">
            </div>
            <div class="mb-3 mt-3">
                <label>Modelo:</label>
                <input type="text" class="form-control" placeholder="Modelo" name="modelo">
            </div>
            <div class="mb-3 mt-3">
                <label>Km:</label>
                <input type="text" class="form-control" placeholder="Km" name="km">
            </div>
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>


</div>
</body>
</html>