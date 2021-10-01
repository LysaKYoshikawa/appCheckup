<%@ page import="com.example.appstudy.domain.Paciente" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.appstudy.repository.PacienteDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/styleHome.css">

    <title>Exames - Confirma!!!</title>
</head>

<body>

<%
    String nome = (String) request.getAttribute("nomeDoPaciente");
    //PacienteDao dao = new PacienteDao();
    //String pacientes = (String) request.getAttribute("Lista");
    //List<Paciente> pacientes = new ArrayList<Paciente>()request.getAttribute("Lista de paciente");
    List<Paciente> pacientes = (List<Paciente>)request.getAttribute("lista");
%>


<div class=" container" >

    <hr>

    <h2> O paciente <%=nome%> foi cadastrado .</h2>

</div>

<form action="pacienteController" method="post">
    <button type="submit" class="btn btn-Link" value="confirmarBotao">Voltar</button>
</form>

</body>


</html>

