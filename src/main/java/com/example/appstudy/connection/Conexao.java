package com.example.appstudy.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static void main (String[] args) throws SQLException{

        final String url = "jdbc:mysql://localhost:?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexao com sucesso!");
        conexao.close();

    }
}
