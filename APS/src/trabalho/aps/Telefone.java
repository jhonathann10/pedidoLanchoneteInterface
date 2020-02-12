package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Telefone {
	//private int cdTelefone;
	private String telefone;
	private String celular;
	
	public Telefone(String telefone, String celular) {
		//this.cdTelefone = cdTelefone;
		this.telefone = telefone;
		this.celular = celular;
	}

	/*public int getCdTelefone() {
		return cdTelefone;
	}

	public void setCdTelefone(int cdTelefone) {
		this.cdTelefone = cdTelefone;
	}*/
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	
	//SQL
	public void inserirTelefone(String telefone, String celular) {
		String sql = "INSERT INTO tb_telefone(nr_telefone, nr_celular) VALUES ('"+ telefone +"', '"+ celular +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inserção realizada!");
			} else {
				System.err.println("Inserção NÃO realizada!");
			}
	}
	
	public int buscarCdTelefone() {
		String sql = "select MAX(cd_telefone) from tb_telefone;";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_telefone.
				int cdTelefone = consulta.getInt(1);
				return cdTelefone;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
}
