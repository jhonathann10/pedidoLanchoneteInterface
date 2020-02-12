package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FormaEntrega {
	//private int cdFormaPagamento;
	private String nomeFormaPagamento;
	

	/*public int getCdFormaPagamento() {
		return cdFormaPagamento;
	}

	public void setCdFormaPagamento(int cdFormaPagamento) {
		this.cdFormaPagamento = cdFormaPagamento;
	}*/

	public String getNomeFormaPagamento() {
		return nomeFormaPagamento;
	}

	public void setNomeFormaPagamento(String nomeFormaPagamento) {
		this.nomeFormaPagamento = nomeFormaPagamento;
	}
	
	public static int buscarCdPedido() {
		String sql = "select MAX(cd_pedido) from tb_pedido;";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(1) retorna a primeira coluna, ou seja, cd_endereco.
				int cdPedido = consulta.getInt(1);
				System.out.println(cdPedido);
				return cdPedido;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
	public void inserirFormaEntrega(int cdPedido, String nmFormaEntrega) {
		String sql = "INSERT INTO tb_forma_de_entrega(cd_pedido, de_forma_entrega) VALUES ('"+ cdPedido +"', '"+ nmFormaEntrega +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inser��o realizada!");
			} else {
				System.err.println("Inser��o N�O realizada!");
			}
	}
	
}
