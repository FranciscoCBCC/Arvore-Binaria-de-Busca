package ArvoreBinariaBusca;

public class Node  {
	 
    public int valor;  //Campo para o valor
    private Node left; //Referência para o nó anterior
    private Node right;  //Referência para o próximo nó
    
    public Node(){  //Construtor vazio
    	
    }

    public Node(int valor) {  //Construtor com o parâmetro valor que será inserido no nó
        this.valor = valor;
    }
    
    public boolean ehFolha() {  //Diz se um nó é folha
        return left == null && right == null;
    }
    
    //Métodos set
    public void setValor(int valor) {  //Seta o valor em um nó
    	this.valor = valor;
    	}
    public void setLeft( Node left){  //Seta um determinado nó no campo esquerdo de outro nó
    	this.left = left;
    }
    
    public void setright( Node right){  //Seta um determinado nó no campo direito de outro nó
    	this.right = right;
    }
    
    //Métodos get
    public int getValor() {  //Retorna um valor de um nó
        return valor;
    }

    public Node getLeft() {  //Retorna o nó que está no campo esquerdo de outro nó
        return left;
    }

    public Node getRight() {  //Retorna o nó que está no campo direito de outro nó
        return right;
    }  	    
}
