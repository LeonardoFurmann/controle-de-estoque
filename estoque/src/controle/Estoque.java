package controle;

import java.util.ArrayList;

public class Estoque {
	
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public void incluir(Produto p) {
		produtos.add(p);
	}
	
	public void comprar(int codigo, int quantidade_comprada, double preco) {
	}
	
	
	public ArrayList<Produto> estoqueAbaixoDoMinimo(){
		return null;
	}
	

	
}
