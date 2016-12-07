package ArvoreBinariaBusca;

public class Node  {
	 
    public int valor;  //Campo para o valor
    private Node left; //Refer�ncia para o n� anterior
    private Node right;  //Refer�ncia para o pr�ximo n�
    
    public Node(){  //Construtor vazio
    	
    }

    public Node(int valor) {  //Construtor com o par�metro valor que ser� inserido no n�
        this.valor = valor;
    }
    
    public boolean ehFolha() {  //Diz se um n� � folha
        return left == null && right == null;
    }
    
    //M�todos set
    public void setValor(int valor) {  //Seta o valor em um n�
    	this.valor = valor;
    	}
    public void setLeft( Node left){  //Seta um determinado n� no campo esquerdo de outro n�
    	this.left = left;
    }
    
    public void setright( Node right){  //Seta um determinado n� no campo direito de outro n�
    	this.right = right;
    }
    
    //M�todos get
    public int getValor() {  //Retorna um valor de um n�
        return valor;
    }

    public Node getLeft() {  //Retorna o n� que est� no campo esquerdo de outro n�
        return left;
    }

    public Node getRight() {  //Retorna o n� que est� no campo direito de outro n�
        return right;
    }  	    
}
