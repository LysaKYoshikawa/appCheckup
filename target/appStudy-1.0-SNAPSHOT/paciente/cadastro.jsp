<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/styleHome.css">
    <title>CheckUp Exames</title>
</head>


<body>
<header class="topo">
    <div>
        <label class="nameJob">Clinica Check-up</label>
    </div>
</header>
<div class="wrapper">

    <div class="container" >
        <form action="confirmacao.jsp">
            <div class="form-group">
                <label>Nome:</label>
                <input type="text" class="form-control" id="pwd" placeholder="Insira seu nome" name="nome">
            </div>

            <div class="form-group">
                <label>Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
            </div>

            <div class="form-group">
                <label>Altura:</label>
                <input type="number" class="form-control" id="alt" placeholder="informe sua altura" name="altura">
            </div>

            <div class="form-group">
                <label>Peso:</label>
                <input type="number" class="form-control" id="peso" placeholder="infome seu peso" name="peso">
            </div>

            <br>

            <label>Tipo de paciente: </label>

            <label class="radio-inline"><input type="radio" name="idade">Adulto</label>
            <label class="radio-inline"><input type="radio" name="idade">Criança</label>
            <label class="radio-inline"><input type="radio" name="idade">Idoso</label>

            <div class="form-group">
                <label for="sel1">Estado de preferência:</label>
                <select class="form-control" id="sel1" name="cidade">
                    <option>São Paulo</option>
                    <option>Rio de Janeiro</option>
                    <option>Santa Catarina</option>
                </select>
            </div>

            <div class="checkbox">
                <p><label>Tipo de Exame</label></p>
                <label><input type="checkbox" name="exames" value="Sangue"> Exame de Sangue</label>
                <label><input type="checkbox" name="exames" value="Urina"> Exame de Urina</label>
                <label><input type="checkbox" name="exames" value="Pressão"> Exame de Pressão</label>
            </div>


            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </div>
</div>
</body>
</html>