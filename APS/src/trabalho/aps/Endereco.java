package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;
import trabalho.aps.jframe.EnderecoFrame;

public class Endereco {
	//private int cdEndereco;
	private String cep;
	private int numeroResidencial;
	private String nomeBairro;
	private String rua;
	private String cidade;
	private String estado;
	private String complemento;
	
	public Endereco(String cep, int numeroResidencial, String nomeBairro, String rua, String cidade, String estado,
			String complemento) {
		//this.cdEndereco = cdEndereco;
		this.cep = cep;
		this.numeroResidencial = numeroResidencial;
		this.nomeBairro = nomeBairro;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
	}

	/*public int getCdEndereco() {
		return cdEndereco;
	}

	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}*/
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroResidencial() {
		return numeroResidencial;
	}

	public void setNumeroResidencial(int numeroResidencial) {
		this.numeroResidencial = numeroResidencial;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//SQL
	public void inserirEndereco(String cep, int numeroResidencial, String nomeBairro, String rua, String cidade, String estado,
			String complemento) {
		String sql = "INSERT INTO tb_endereco(nr_cep, nr_residencial, nm_bairro, nm_cidade, nm_estado, de_rua, de_complemento) VALUES ('"+ cep +"', '"+ numeroResidencial +"', '"+ nomeBairro +"', '"+ cidade +"', '"+ estado +"', '"+ rua +"', '"+ complemento +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inser��o realizada!");
			} else {
				System.err.println("Inser��o N�O realizada!");
			}
	}
	
	public int buscarCdEndereco() {
		String sql = "select MAX(cd_endereco) from tb_endereco;";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_endereco.
				int cdEndereco = consulta.getInt(1);
				return cdEndereco;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
	public static int buscarDadosEndereco(int cdEndereco) {
		String sql = "select nm_bairro, nm_cidade, nm_estado, de_rua, nr_residencial, de_complemento, nr_cep from tb_endereco where cd_endereco = ('" + cdEndereco + "');";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_endereco.
				String nm_bairro = consulta.getString(1);
				String nm_cidade = consulta.getString(2);
				String nm_estado = consulta.getString(3);
				String de_rua = consulta.getString(4);
				int nr_residencial = consulta.getInt(5);
				String de_complemento = consulta.getString(6);
				String nr_cep = consulta.getString(7);
                                
				EnderecoFrame.tFBairroFrame.setText(nm_bairro);
				EnderecoFrame.tFCidadeFrame.setText(nm_cidade);
				EnderecoFrame.tFEstadoFrame.setText(nm_estado);
				EnderecoFrame.tFNomeRuaFrame.setText(de_rua);
                                String nrResidencialString = String.valueOf(nr_residencial);
				EnderecoFrame.tFNumeroFrame.setText(nrResidencialString);
				EnderecoFrame.tFComplementoFrame.setText(de_complemento);
				EnderecoFrame.tFCEPFrame.setText(nr_cep);
				return cdEndereco;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
	public static int selectEndereco(int cdCliente) {
		String sql = "select cd_endereco from tb_cliente where cd_cliente = ('" + cdCliente + "');";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_endereco.
				int cdEndereco = consulta.getInt(1);
				return cdEndereco;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
	public static void updateEndereco(String cep, int numeroResidencial, String nomeBairro, String rua, String cidade, String estado,
			String complemento, int cdEndereco) {
		String sql = "UPDATE tb_endereco SET nr_cep = ('"+ cep +"'), nr_residencial = ('"+ numeroResidencial +"'), nm_bairro = ('"+ nomeBairro +"'), nm_cidade = ('"+ cidade +"'), nm_estado = ('"+ estado +"'), de_rua = ('"+ rua +"'), de_complemento = ('"+ complemento +"') where cd_endereco = ('"+ cdEndereco +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Atualiza��o realizada!");
			} else {
				System.err.println("Atualiza��o N�O realizada!");
			}
	}
}
