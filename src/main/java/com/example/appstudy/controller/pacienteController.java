package com.example.appstudy.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.example.appstudy.domain.Paciente;
import com.example.appstudy.repository.PacienteDao;

@WebServlet(name = "pacienteController", value = "/pacienteController")
public class pacienteController extends HttpServlet {
    private static final long serialVersionUID =1l;



    public pacienteController(){
        super();

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tela = request.getParameter("tela");

        if("listaBotao".equals(tela)){
            request.getRequestDispatcher("paciente/cadastro.jsp").forward(request,response);
        }else{
            request.setAttribute("lista",PacienteDao.obterLista());
            request.getRequestDispatcher("paciente/lista.jsp").forward(request,response);
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Paciente paciente = new Paciente(request.getParameter("nome"), request.getParameter("email"));
        paciente.setAltura(request.getParameter("altura"));
        paciente.setPeso(request.getParameter("peso"));
        paciente.setIdade(request.getParameter("idade"));
        paciente.setCidade(request.getParameter("cidade"));
        paciente.setExames(request.getParameterValues("exames"));
        //paciente.impressao();

        PacienteDao.incluir(paciente);


        request.setAttribute("nomeDoPaciente",paciente.getNome());
        request.setAttribute("lista",PacienteDao.obterLista());

       request.getRequestDispatcher("confirmacao.jsp").forward(request,response);



    }
}

   // PrintWriter out = response.getWriter();

  //      out.println(
   //             "<!DOCTYPE html>" +
    //            "<html> \r \n" +
    //            "<head>\r \n" +
     //           "<meta charset=\"ISO-8859-1\"> \r \n" +
   //             //" <link rel="stylesheet" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"\> \r \n" +
   //             "<title>Exames - Confirma!!!</title> \r \n" +
   //             " </head> \r \n" +
   //             " <body> \r \n" +
   //             " <div class=\"container\">\r \n" +
   //             "<h2> O Paciente foi " + paciente.getNome() + " Foi cadastrado com sucesso!!!</h2> \r \n" +
  //              "<h3> A quantidade " + pacientes.size() + " foi cadastrada, com sucesso!!!</h3> \r \n" +
   //             "<a href= 'pacienteController' >Voltar</a> \r \n" +
//
   //             "  </div>" +
//
    //            " </body>" +
    //            " </html>"

                // "Os pacientes: " + paciente.getNome() + " quantidade: " + pacientes.size()

    //            );
