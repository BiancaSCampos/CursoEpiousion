package util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import br.com.epiousion.exception.GlobalcodeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
	 */
	private static final String DATABASE = "aj";
	private static final String IP = "192.168.0.1";
	private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE;
	private static final String USER = "aj";
	private static final String PASSWORD = "aj";

	public static Connection getConnection() throws GlobalcodeException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("[ConnectionManager]: Obtendo conexao");
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
		return conn;                
	}

	public static void closeAll(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}

	public static void closeAll(Connection conn, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
			closeAll(conn);
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}

	public static void closeAll(Connection conn, Statement stmt, ResultSet rs){
		try {
			if (rs != null){
				rs.close();
				closeAll(conn, stmt);
			}
		}catch (Exception e){
			System.out.println("---> Não foi possível fechar a conexão com o banco");
			System.out.println("---> Detalhamento do erro");
			e.printStackTrace();
		}
	}
}
