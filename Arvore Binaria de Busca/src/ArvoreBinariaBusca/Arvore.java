package ArvoreBinariaBusca;

public class Arvore{
	private Node raiz;  //Raiz da �rvore

	public Arvore(){
		System.out.println("�rvore Criada."); //Construtor sem par�metro
	}
	
	public boolean estaVazia(){  //Verifica se a �rvore est� vazia
        if(raiz == null){
            return true;
        }
        return false;
    }
    
    public int getAltura(){ //M�todo que retorna a altura  da �rvore
        return getAltura(this.raiz);
    }
    
    private int getAltura(Node raiz){  //M�todo que retorna a altura da �rvore
        if(raiz == null){
            return 0;
        }
        int altEsq = getAltura(raiz.getLeft());
        int altDir = getAltura(raiz.getRight());
        if(altEsq > altDir){
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }
    
    public int getQtdNode(){  //M�todo que retorna a quantidade de n�s
        return getQtdNode(raiz);
    }
    
    private int getQtdNode(Node raiz){  //M�todo que retorna a quantidade de n�s
        if(raiz == null){
            return 0;
        }
        int qtdNodeEsq = getQtdNode(raiz.getLeft());
        int qtdNodeDireita = getQtdNode(raiz.getRight());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }
    
    
    public void imprimirArvore(){  //Imprime a �rvore
        if(this.raiz == null)
            System.out.println("�rvore vazia");
        else
            imprimirArvore(this.raiz);
    }
    
    private void imprimirArvore(Node node){  //M�todo que percorre a �rvore para imprim�-la
        if(node.getLeft() != null){
            imprimirArvore(node.getLeft());
        }
        if (node.getRight() != null){
            imprimirArvore(node.getRight());
        }
        System.out.println("N�: " + node.getValor());
    }
    
    public void inserir(int valor){  //Insere um novo valor na �rvore
        inserir(this.raiz, valor);
    }
    
    public void inserir(Node node, int valor) {  //M�todo que determina o local de um novo valor na �rvore
        if(this.raiz == null){
            this.raiz = new Node(valor);
        } else {
            if (valor < node.getValor()) {
                if (node.getLeft() != null) { 
                    inserir(node.getLeft(), valor); 
                } else { 
                    //Se nodo esquerdo vazio insere o novo no aqui 
                    node.setLeft(new Node(valor)); 
                } 
                //Verifica se o valor a ser inserido � maior que o no corrente da �rvore, se sim vai para subarvore direita 
            } else if (valor > node.getValor()) { 
                //Se tiver elemento no no direito continua a busca 
                if (node.getRight() != null) { 
                    inserir(node.getRight(), valor); 
                } else {
                    //Se nodo direito vazio insere o novo no aqui 
                    node.setright(new Node(valor)); 
                } 
            }
        }
    }
    
    public void busca(int x){  //Busca um valor na �rvore  
    	busca(this.raiz, x);  
    }  

    
    int contador = 0; // variav�l para controlar o nivel da �rvore 
    
    // M�todo para percorrer a arvor� e achar o elemento
    public void busca ( Node no , int x ){  

        if ( no == null )  
        {  
            System.out.println( " Nivel -1 " );  
        }  
        else if ( no.getValor() == x )  
        {  
            System.out.println(" Nivel " + contador );  
        }  
        else if ( no.getValor() > x )  
        {  
           if ( no != null )  
           {  
               contador ++;  
               busca( no.getLeft() , x );  
           }  

        }  
        else if ( no.getValor() < x )  
        {  
            if( no != null )  
            {  
                contador ++;  
                busca(no.getRight() , x );  
            }  

        }  
        contador = 0;
    }
    
    
    /*
    public Node remover(int valor) throws Exception{
        return remover(this.raiz, valor);
    }
    */
    /*
    private Node remover(Node node, int valor) throws Exception{
        if(this.raiz == null){
            throw new Exception("�rvore vazia");
        } else {            
            if(valor < node.getValor()){
                node.setLeft(remover(node.getLeft(), valor));
            } else if(valor > node.getValor()){
                node.setright(remover(node.getRight(), valor));
            } else if (node.getLeft() != null && node.getRight() != null) {
                //2 filhos  
                System.out.println("  Removeu No " + node.getValor());
                node.setValor(encontraMinimo(node.getRight()).getValor());
                node.setright(removeMinimo(node.getRight()));
            } else {  
                System.out.println("  Removeu No " + node.getValor());  
                node = (node.getLeft() != null) ? node.getLeft() : node.getRight();  
            }  
            return node;
        }
        
    }
    */
    
    
    /*
    private Node removeMinimo(Node node) {  
        if (node == null) {  
            System.out.println("  ERRO ");  
        } else if (node.getLeft() != null) {  
            node.setLeft(removeMinimo(node.getLeft()));  
            return node;  
        } else {  
            return node.getRight();  
        }  
        return null;  
    }  
  	
    private Node encontraMinimo(Node node) {  
        if (node != null) {  
            while (node.getLeft() != null) {  
                node = node.getLeft();  
            }  
        }  
        return node;  
    }
    */
}