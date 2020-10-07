/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.epiousion.dao;

import br.com.epiousion.beans.Cliente;
import br.com.epiousion.exception.GlobalcodeException;
import br.com.epiousion.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClientesDAOImpl implements IClientesDAO {

	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = '";
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
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans
	 * .Cliente)
	 */
	public void excluir(String cpf) throws GlobalcodeException {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			int numeroLinhas = stmt.executeUpdate(DELETE_CLIENTE + cpf + "'");
			System.out.println("Numero de clientes excluidos: " + numeroLinhas);
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao excluir cliente: "
					+ DELETE_CLIENTE, e);
		} finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see
	 * br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	public void salvar(Cliente cliente) throws GlobalcodeException {
		/*
		 * Gravar os dados do cliente no banco de dados usando a constante
		 * SALVAR_CLIENTE
		 */

		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn =  ConnectionManager.getConnection();
			stmt = conn.prepareStatement(SALVAR_CLIENTE);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getTelefone());

			stmt.executeUpdate();
		}catch (SQLException e){
			throw new GlobalcodeException(	"Nao foi possivel salvar o cliente na base de dados.", e);
		}finally {
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	public List getAllClientes() throws GlobalcodeException {
		ArrayList clientes = new ArrayList();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(GET_ALL_CLIENTES);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String telefone = rs.getString("telefone");
				Cliente c = new Cliente(nome, telefone, cpf, id);
				clientes.add(c);
			}
			return clientes;
		} catch (SQLException e) {
			throw new GlobalcodeException(
					"Nao foi possivel recuperar os clientes da base de dados.",
					e);
		} finally {
			ConnectionManager.closeAll(conn, stmt, rs);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException {
		/*
		 * Consultar um cliente no banco de dados usando a constante
		 * GET_CLIENTE_BY_CPF.
		 */

		// Declarar uma variavel para a Connection
		Connection conn = null;

		// Declarar uma variavel para o PreparedStatement
		PreparedStatement stmt = null;

		// Declarar uma variavel para o ResultSet
		ResultSet rs = null;

		Cliente cliente = null;

		try{
			conn = ConnectionManager.getConnection();
			stmt = conn.prepareStatement(GET_CLIENTE_BY_CPF);
			stmt.setString(1, cpf);
			rs = stmt.executeQuery();
			while (rs.next()){
				cliente = new Cliente(rs.getString("nome"),rs.getString("telefone"), rs.getString("cpf"),rs.getInt("id"));
			}
		}catch (SQLException e){
			throw  new GlobalcodeException(	"Nao foi possivel encontrar o cliente na base de dados.", e);
		}finally {
			ConnectionManager.closeAll(conn, stmt, rs);
		}
		return cliente;
	}

}
