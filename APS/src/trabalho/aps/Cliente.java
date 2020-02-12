package trabalho.aps;

public class Cliente {
	//private int cdCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String dtNasc;
	private String email;
	private int cdEndereco;
	private int cdAutenticacao;
	private int cdTelefone;
	
	
	
	public Cliente(String nomeCliente, String cpfCliente, String dtNasc, String email,
			int cdEndereco, int cdAutenticacao, int cdTelefone) {
		//this.cdCliente = cdCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dtNasc = dtNasc;
		this.email = email;
		this.cdEndereco = cdEndereco;
		this.cdAutenticacao = cdAutenticacao;
		this.cdTelefone = cdTelefone;
	}

	/*public int getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	} */

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCdEndereco() {
		return cdEndereco;
	}

	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}

	public int getCdAutenticacao() {
		return cdAutenticacao;
	}

	public void setCdAutenticacao(int cdAutenticacao) {
		this.cdAutenticacao = cdAutenticacao;
	}

	public int getCdTelefone() {
		return cdTelefone;
	}

	public void setCdTelefone(int cdTelefone) {
		this.cdTelefone = cdTelefone;
	}
	
	public void inserirCliente(String nomeCliente, String cpfCliente, String dtNasc, String email,
			int cdEndereco, int cdAutenticacao, int cdTelefone) {
		String sql = "INSERT INTO tb_cliente(nm_cliente, nr_cpf, dt_nascimento, de_email, cd_endereco, cd_autenticacao, cd_telefone) VALUES ('"+ nomeCliente +"', '"+ cpfCliente +"', '"+ dtNasc +"', '"+ email +"', '"+ cdEndereco +"', '"+ cdAutenticacao +"', '"+ cdTelefone +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inser��o realizada!");
			} else {
				System.err.println("Inser��o N�O realizada!");
			}
	}
	
}
