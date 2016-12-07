package ArvoreBinariaBusca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arvore arvoreBinBusca = new Arvore();
		Node noh = new Node(3);
		arvoreBinBusca.inserir(40);
		arvoreBinBusca.inserir(46);
		// insere raiz
		arvoreBinBusca.inserir(noh, 5);
		arvoreBinBusca.imprimirArvore();

	}

}
