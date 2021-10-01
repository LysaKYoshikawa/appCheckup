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
    <form action="pacienteController" method="get">
    <button type="submit" class="btn btn-Link" name="tela" value="listaBotao">Incluir</button>
    </form>

    <hr>


    <h2> <%=pacientes.size()%> pacientes foram cadastrados.</h2>



    <table class="table table-striped">

        <tbody>
        <tr>
            <td>nome</td>
            <td>email</td>
            <td>idade</td>
            <td>exame</td>
            <td>cidade</td>
        </tr>

        <%
            //List<Paciente> pacientes = (List<Paciente>)request.getAttribute("lista");


            for(Paciente a : pacientes ) {
        %>
        <tr>
            <td><%=a.getNome()%></td>
            <td><%=a.getEmail()%></td>
            <td><%=a.getIdade()%></td>
            <td><%=a.getExames()%></td>
            <td><%=a.getCidade()%></td>
        </tr>
        <%
            }
        %>

        </tbody>

    </table>
</div>


</body>


</html>

