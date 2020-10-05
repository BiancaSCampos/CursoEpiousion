
package br.com.epiousion.dao;
import br.com.epiousion.beans.Cliente;
import br.com.epiousion.dao.IClientesDAO;
import br.com.epiousion.exception.GlobalcodeException;
import br.com.epiousion.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


	public class ClientesDAOImpl implements IClientesDAO {

		private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
		private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
		private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = ''";
		private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
		private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

		public void createTable() throws GlobalcodeException {
			Connection conn = null;
			Statement stmt = null;
			try {
				conn = ConnectionManager.getConnection();
				stmt = conn.createStatement();
				stmt.executeUpdate(CREATE_TABLE);
			} catch (SQLException e) {
				throw new GlobalcodeException(
						"Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
			} finally {
				ConnectionManager.closeAll(conn);
			}
		}

		/*
		 * @see
		 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans.Cliente)
		 */
		public void excluir(String cpf) throws GlobalcodeException {
			Connection conn = null;
			Statement stmt = null;
			try {
				//Abertura da conexao
				conn = ConnectionManager.getConnection();
				//Criacao do Statement
				stmt = conn.createStatement();
				//Execucao da query
				int numeroLinhas = stmt.executeUpdate(DELETE_CLIENTE + cpf + "'");
				//Impressao do numero de linhas alteradas
				System.out.println("Numero de clientes excluidos: " + numeroLinhas);
			} catch (SQLException e) {
				throw new GlobalcodeException("Erro ao excluir cliente: "
						+ DELETE_CLIENTE, e);
			} finally {
				ConnectionManager.closeAll(conn);
			}
		}

		/*
		 * @see
		 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
		 * Cliente)
		 */
		public void salvar(Cliente cliente) throws GlobalcodeException {
		}

		/*
		 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
		 */
		public List getAllClientes() throws GlobalcodeException{
			return null;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
		 */
		public Cliente getClienteByCPF(String cpf) throws GlobalcodeException{
			return null;
		}
	}

