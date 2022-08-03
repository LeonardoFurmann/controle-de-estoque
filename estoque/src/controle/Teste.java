package controle;

public class Teste {

	public static void main(String[] args) {
		
		
		Estoque estoque_sorveteria = new Estoque();
		

		Produto novo_produto = new Produto("Água", 1, 2 , 2 , 2.00 , 4.00, 0.5, 
				new Fornecedor(1234, "Fornecedor de água"));
		
		
		
		estoque_sorveteria.incluir(novo_produto);
		
			
		for (Produto produto : estoque_sorveteria.produtos) {
			produto.listarProduto();
		}
		
		
		novo_produto.comprar(3, 5.00);
		
		novo_produto.listarProduto();
		
		novo_produto.vender(2);
		
		novo_produto.listarProduto();
		
		
		
		
		
		
		
		
		
		
//		estoque_sorveteria.listarProdutosAbaixoDoMinimo();
		
		
		
	}

}
