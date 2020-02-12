package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Autenticacao {
	//private int cdAutenticacao;
	private String login;
	private String senha;

	public Autenticacao(String login, String senha) {
		//this.cdAutenticacao = cdAutenticacao;
		this.login = login;
		this.senha = senha;
	}
	
	/*public int getCdAutenticacao() {
		return cdAutenticacao;
	}
	public void setAutenticacao(int cdAutenticacao) {
		this.cdAutenticacao = cdAutenticacao;
	}*/
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//SQL
	public void inserirAutenticacao(String login, String senha) {
		String sql = "INSERT INTO tb_autenticacao(nm_login, de_senha) VALUES ('"+ login +"', '"+ senha +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inserção realizada!");
			} else {
				System.err.println("Inserção NÃO realizada!");
			}
	}
	
	//Buscando a chave primária
	public int buscarCdAut() {
		String sql = "select MAX(cd_autenticacao) from tb_autenticacao;";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_autenticacao.
				int cdAutenticacao = consulta.getInt(1);
				return cdAutenticacao;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
	//Validando login e senha
	public boolean consultarAutenticacao (String login, String senha) {
		boolean autenticado = false;
		String sql;
		sql = "SELECT nm_login, de_senha FROM tb_autenticacao WHERE nm_login = '"+ login +"' AND de_senha = '"+ senha +"';";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			if(consulta.next()) {
				String loginBanco = consulta.getString("nm_login");
				String senhaBanco = consulta.getString("de_senha");
				autenticado = true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return autenticado;
	}
	
}
