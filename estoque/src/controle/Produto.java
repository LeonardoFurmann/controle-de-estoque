package controle;

public class Produto {	
	
	private int codigo, estoque_min, quantidade;
	private String descricao;
	private double preco_venda, preco_compra, lucro;
	private Fornecedor forn;
	
	
	
	
	
	public Produto(String descricao, int codigo, int estoque_min, int quantidade, double preco_compra, double preco_venda,
			 double lucro, Fornecedor forn) {
		super();
		this.codigo = codigo;
		this.estoque_min = estoque_min;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco_venda = preco_venda;
		this.preco_compra = preco_compra;
		this.lucro = lucro;
		this.forn = forn;
	}


	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEstoque_min() {
		return estoque_min;
	}

	public void setEstoque_min(int estoque_min) {
		this.estoque_min = estoque_min;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public double getPreco_compra() {
		return preco_compra;
	}
	
	public void setPreco_compra(double preco_compra) {
		this.preco_compra = preco_compra;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public Fornecedor getForn() {
		return forn;
	}

	public void setForn(Fornecedor forn) {
		this.forn = forn;
	}




	void comprar(int quantidade_comprada , double preco) {
		
		double aux;
		
		aux = this.quantidade * this.preco_compra;
		aux += quantidade_comprada * preco;
			
		this.quantidade += quantidade_comprada;
		
		aux /= this.quantidade;
		this.preco_compra = aux;
		
		atualizarPrecoVenda();
		
		
	}
	
	
	private void atualizarPrecoVenda() {
		this.preco_venda += this.preco_compra * (this.lucro+1);
	}
	
	
	
	
	double vender(int quantidade_vendida) {
		
		if( this.quantidade < quantidade_vendida) {
		
			return -1;
		} else {
		
			double valor = (quantidade_vendida * this.preco_venda);
			
			this.quantidade -= quantidade_vendida;
			
			
			return valor;
		}
	}
	
	
	public boolean produtoAbaixoDoMinimo() {
		
		if(this.quantidade < this.estoque_min) {
			return true;
		} else {
			return false;		
		}
		
	}
	
	
		void listarProduto() {
			System.out.println();
			System.out.println();
			System.out.println(getDescricao());
			System.out.println("Código: " + getCodigo());
			System.out.println("Quantidade: " + getQuantidade());
			System.out.println("Estoque mínimo: " + getEstoque_min());
			System.out.println("Preço compra: " + getPreco_compra());
			System.out.println("Preço Venda: " + getPreco_venda());
			System.out.println("Lucro: " + getLucro());
			System.out.println("CNPJ Fornecedor: " + getForn().getCnpj());
			System.out.println("Nome Fornecedor: " + getForn().getNome());
		}
		
	}
	
	
	
