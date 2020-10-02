/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.epiousion.teste;

import java.sql.Connection;

import br.com.epiousion.exception.GlobalcodeException;
import br.com.epiousion.util.ConnectionManager;

public class TesteConexao {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionManager.getConnection();
		} catch (GlobalcodeException ge) {
			System.out.println("---> " + ge.getMessage());
			System.out.println("---> Detalhamento do erro: ");
			ge.printStackTrace();
		} finally {
			ConnectionManager.closeAll(conn);
		}
	}

}
