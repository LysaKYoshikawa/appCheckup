package com.example.appstudy.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

    public static void main(String[] arg) throws SQLException {
        Connection conexao = FazerConexao.getConexao();
        String sql = "CREATE TABLE ("
                + "codigo int auto_increment primary key,"
                + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("tabela criada com sucesso!");
        conexao.close();

    }
}
