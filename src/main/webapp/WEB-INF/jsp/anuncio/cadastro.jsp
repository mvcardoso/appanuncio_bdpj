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
<c:set var="ativaBotao" value="" />
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h2>Cadastramento de Anuncio</h2>

        <form action="/anuncio/incluir" method="post">

            <div class="mb-3 mt-3">
                <label>Descrição:</label>
                <input type="text" class="form-control" placeholder="titulo" name="titulo">
            </div>
            <div class="mb-3 mt-3">
                <c:if test="${not empty responsavel}">
                <label>Responsável:</label>
                <select name="responsavel.id" class="form-control" id="sel1">
                    <c:forEach var="r" items="${responsavel}">
                        <option value="${r.id}">${r.nome}</option>
                    </c:forEach>
                </select>
                </c:if>
                <c:if test="${empty responsavel}">
                    <label>Não existe responsável cadastrado. </label>
                    <c:set var="ativaBotao" value="disabled" />
                </c:if>
            </div>

            <div class="mb-3 mt-3">
                <c:if test="${not empty itens}">
                <label>Itens:</label>
                <c:forEach var="i" items="${itens}">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" name="itens" value="${i.id}">
                            ${i.descricaoCompleta}
                        </label>
                    </div>
                </c:forEach>
                </c:if>
                <c:if test="${empty itens}">
                    <label>Não existe item cadastrado. </label>
                    <c:set var="ativaBotao" value="disabled" />
                </c:if>
            </div>

            <button ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
        </form>


</div>
</body>
</html>