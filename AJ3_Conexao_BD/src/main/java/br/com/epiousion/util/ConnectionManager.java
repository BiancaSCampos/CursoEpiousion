package br.com.epiousion.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import br.com.epiousion.exception.GlobalcodeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager {


	public static Connection getConnection() throws GlobalcodeException {
		Connection conn = null;
		try {
			// a) Faca a abertura da conexao
			conn = DriverManager.getConnection("jdbc:mysql://host:3306/local", "root", "root");
			System.out.println("[ConnectionManager]: Obtendo conexao");
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
                return conn;
	}

	public static void closeAll(Connection conn) {
		try {
			// b)Se a conexao (conn) nao eh null, entao feche a conexao
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
}
