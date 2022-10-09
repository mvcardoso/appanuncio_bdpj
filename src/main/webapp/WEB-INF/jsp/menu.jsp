<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

<nav class="navbar navbar-expand-sm bg-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>

            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario/lista">Usuario</a>
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
                <li class="nav-item">
                    <a class="nav-link" href="/item/lista">Item</a>
                </li>
            </c:if>
        </ul>
        <ul class="navbar-nav">
            <c:if test="${empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/usuario">Signup</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Login</a>
                </li>
            </c:if>

            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Logout | ${user.nome}</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>
