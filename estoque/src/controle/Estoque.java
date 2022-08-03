package controle;

import java.util.ArrayList;

public class Estoque {
	
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public void incluir(Produto p) {
		produtos.add(p);
	}
	
	
		void listarProdutosAbaixoDoMinimo(){
			
		for (Produto produto : produtos) {	
			
			if(produto.produtoAbaixoDoMinimo()) {
				
				produto.listarProduto();
			} else {}
			
		}
			
	}


}
