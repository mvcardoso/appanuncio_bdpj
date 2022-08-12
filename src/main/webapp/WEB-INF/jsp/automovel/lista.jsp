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
                <a class="nav-link" href="#">Comida</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">
    <h2>AppAnuncio</h2>
    <p>Projeto de Gestão de Anúncios</p>

    <h3>Classe: Automovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Preco</th>
            <th>Descricao Completa</th>
            <th>Marca</th>
            <th>Km</th>
            <th>Modelo</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>01</td>
            <td>R$ 40.000</td>
            <td>Honda Fit completo etc...</td>
            <td>Honda</td>
            <td>50.000Km</td>
            <td>2018</td>
        </tr>
        <tr>
            <td>02</td>
            <td>Integer</td>
            <td>Kilometragem do automóvel</td>
            <td>marca</td>
            <td>String</td>
            <td>Marca do automóvel</td>
        </tr>
        <tr>
            <td>03</td>
            <td>String</td>
            <td>Modelo do automóvel</td>
            <td>marca</td>
            <td>String</td>
            <td>Marca do automóvel</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>