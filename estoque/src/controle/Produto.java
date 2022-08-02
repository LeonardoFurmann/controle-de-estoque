package controle;

public class Produto {	
	
	int codigo, estoque_min, quantidade;
	String descricao;
	double preco_venda, preco_compra, lucro;
	Fornecedor forn;
	
	
	
	
	
	public Produto(int codigo, int estoque_min, int quantidade, String descricao, double preco_venda,
			double preco_compra, double lucro) {
		super();
		this.codigo = codigo;
		this.estoque_min = estoque_min;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco_venda = preco_venda;
		this.preco_compra = preco_compra;
		this.lucro = lucro;
//		this.forn = forn;
	}





	void comprar(int codigo, int quantidade_comprada , double preco) {
		
		this.preco_compra = (this.quantidade * this.preco_compra + quantidade_comprada * preco);
		
		this.preco_venda += preco_compra * lucro;
		
		this.quantidade += quantidade_comprada;
		
		System.out.println(preco_compra);
	}
	
	
	double vender(int codigo, int quantidade_vendida) {
		
	while( this.quantidade > 0) {
		
		this.quantidade -= quantidade_vendida;
	}
	
	
	double valor = this.quantidade >= 0 ? quantidade_vendida * preco_venda : -1;
	
	return valor;
		
		
}
}