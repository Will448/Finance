
package br.com.finfac.dao;

import java.sql.*;

public class ModuloConexao {

    /*
    *metodo responsavel pela conexão do banco de dados
        @return conexao
     */
    public static Connection conectar() {
        Connection conexao;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/finance";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("conectado com o BD");
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
