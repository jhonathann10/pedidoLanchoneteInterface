package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pedido {
	//private String cdPedido;
	private Cliente cdCliente;
	private Produto cdProduto;
	private float vlTotal;
	
	/*public Pedido(Cliente cdCliente, Produto cdProduto) {
		//this.cdPedido = cdPedido;
		this.cdCliente = cdCliente;
		this.cdProduto = cdProduto;
	}*/

	/*public String getCdPedido() {
		return cdPedido;
	}

	public void setCdPedido(String cdPedido) {
		this.cdPedido = cdPedido;
	}*/

	public Cliente getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(Cliente cdCliente) {
		this.cdCliente = cdCliente;
	}

	public Produto getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(Produto cdProduto) {
		this.cdProduto = cdProduto;
	}
	
	public float valorTotal() {
		return vlTotal;
	}
	
	public static void inserirPedido(int cdCliente, int quantidade, float vlTotal) {
		String sql = "INSERT INTO tb_pedido(cd_cliente, nr_qtd, vl_total) VALUES ('"+ cdCliente +"', '"+ quantidade +"', '"+ vlTotal +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inser��o realizada!");
			} else {
				System.err.println("Inser��o N�O realizada!");
			}
	}
	
	public static int buscarCdCliente(String nmLogin) {
		String sql = "SELECT nm_login, cd_cliente FROM tb_autenticacao INNER JOIN tb_cliente ON tb_autenticacao.cd_autenticacao = tb_cliente.cd_autenticacao where nm_login = ('"+ nmLogin +"');";
		Conexao con = new Conexao();
		
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
				//getInt(2) retorna a primeira coluna, ou seja, cd_endereco.
				int cdCliente = consulta.getInt(2);
				return cdCliente;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
}
