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

    <h3>Classe: Anuncio</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>titulo</td>
            <td>String</td>
            <td>Título do Anúncio</td>
        </tr>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição do Anúncio</td>
        </tr>
        <tr>
            <td>dataCadastro</td>
            <td>Date</td>
            <td>Data que foi efetuado o cadastro do anúncio</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Item</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição do item.</td>
        </tr>
        <tr>
            <td>preco</td>
            <td>Double</td>
            <td>Preço do item</td>
        </tr>
        <tr>
            <td>id</td>
            <td>Long</td>
            <td>Identificador do item</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Automovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>marca</td>
            <td>String</td>
            <td>Marca do automóvel</td>
        </tr>
        <tr>
            <td>km</td>
            <td>Integer</td>
            <td>Kilometragem do automóvel</td>
        </tr>
        <tr>
            <td>modelo</td>
            <td>String</td>
            <td>Modelo do automóvel</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Imovel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>tipoImovel</td>
            <td>String</td>
            <td>Tipo do imóvel: Casa, apartamento, kitnet, loja</td>
        </tr>
        <tr>
            <td>cidade</td>
            <td>String</td>
            <td>Local do imóvel</td>
        </tr>
        <tr>
            <td>area</td>
            <td>Integer</td>
            <td>Tamanho em m² da área do imóvel</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Servico</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>tipoServico</td>
            <td>String</td>
            <td>Tipo do serviço: Mecânico, marcenaria, manicure, pedreiro</td>
        </tr>
        <tr>
            <td>redeSocial</td>
            <td>String</td>
            <td>Link de alguma rede social: Instagram, facebook</td>
        </tr>
        <tr>
            <td>notaAvaliacao</td>
            <td>Integer</td>
            <td>Nota de avaliação dos usuários</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Responsavel</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do responsável do anúncio</td>
        </tr>
        <tr>
            <td>telefone</td>
            <td>String</td>
            <td>Número de contato do responsável do anúncio</td>
        </tr>
        <tr>
            <td>email</td>
            <td>String</td>
            <td>E-mail de contato</td>
        </tr>
        <tr>
            <td>senha</td>
            <td>String</td>
            <td>Senha de acesso</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>