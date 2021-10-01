package com.example.appstudy.controller;

import com.example.appstudy.domain.Paciente;
import com.example.appstudy.domain.loginUsuario;
import com.example.appstudy.repository.PacienteDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "loginUsuarioController", value = "/loginUsuarioController")
public class loginUsuarioController extends HttpServlet {
    private static final long serialVersionUID =1l;

    //private List<login> usuarios;

   // public loginUsuarioController(){
    //    super();
    //    usuarios = new ArrayList<login>();
    //}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("loginUsuario.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //loginUsuario login = new loginUsuario(request.getParameter("email"), request.getParameter("senha"));

        //request.getRequestDispatcher("cadastro.jsp").forward(request,response);

        String email = request.getParameter("email");
        String senha = request.getParameter("senha");


        Paciente paciente = PacienteDao.validar(email, senha);

        if(paciente != null){

            request.setAttribute("lista", PacienteDao.obterLista());


            request.getRequestDispatcher("paciente/lista.jsp").forward(request,response);
        }else{


            request.setAttribute("mensagemAlerta", "Autenticação invalida para o usuario " + email +  "!!!");

            doGet(request,response);




           // request.getRequestDispatcher("loginUsuario.jsp").forward(request,response);
        }


    }
}
