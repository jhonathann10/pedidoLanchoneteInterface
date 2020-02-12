package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FormaPagamento {
	//private int cdFormaPagamento;
	private Pedido cdPedido;
	private String deFormaPagamento;
	
	/*public FormaPagamento(Pedido cdPedido, String deFormaPagamento) {
		//this.cdFormaPagamento = cdFormaPagamento;
		this.cdPedido = cdPedido;
		this.deFormaPagamento = deFormaPagamento;
	}

	/*public int getCdFormaPagamento() {
		return cdFormaPagamento;
	}

	public void setCdFormaPagamento(int cdFormaPagamento) {
		this.cdFormaPagamento = cdFormaPagamento;
	}*/

	public Pedido getCdPedido() {
		return cdPedido;
	}

	public void setCdPedido(Pedido cdPedido) {
		this.cdPedido = cdPedido;
	}

	public String getDe_formaPagamento() {
		return deFormaPagamento;
	}

	public void setDe_formaPagamento(String deFormaPagamento) {
		this.deFormaPagamento = deFormaPagamento;
	}
	
	public void inserirFormaPagamento(String nmFormaPagamento, int cdPedido) {
		String sql = "INSERT INTO tb_forma_de_pagamento(nm_forma_de_pagamento, cd_pedido) VALUES ('"+ nmFormaPagamento +"', '"+ cdPedido +"');";
		Conexao con = new Conexao();
		int res = con.executeUpdate(sql);
			if (res >= 1) {
				System.out.println("Inserção realizada!");
			} else {
				System.err.println("Inserção NÃO realizada!");
			}
	}
	
	public int buscarCdPedido() {
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
	
}
