 package trabalho.aps;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto {
	//private int cdProduto;
	public static String produto;
	public static String de_produto;
	public static float vlProduto;
	private float vlTotal;

	/*public int getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}*/

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDe_produto() {
		return de_produto;
	}

	public void setDe_produto(String de_produto) {
		this.de_produto = de_produto;
	}

	public float getVlProduto() {
		return vlProduto;
	}

	public void setVlProduto(float vlProduto) {
		this.vlProduto = vlProduto;
	}
	
	public int buscarCardapio(int codigo) {
		String sql = "select * from tb_produto where cd_produto = ('"+ codigo +"');";
		Conexao con = new Conexao();
		try {
			ResultSet consulta = con.executeQuery(sql);
			consulta.next();
			
			this.produto = consulta.getString("nm_produto");
			this.de_produto = consulta.getString("de_produto");
			this.vlProduto = consulta.getInt(4);
			//System.out.println(this.produto + "(" + this.de_produto + ")"  + " R$" + this.vlProduto);
			return 0;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
	
}
