package ArvoreBinariaBusca;

import java.util.Scanner;

public class Main {

	public static void menu(){
		System.out.println("1 - Inserir");
		System.out.println("2 - Imprimir");
		System.out.println("3 - Buscar");
		System.out.println("Op��o: ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
        Scanner entrada = new Scanner(System.in);
        Arvore arvoreBinBusca = new Arvore();
        do{
            menu();
            opcao = entrada.nextInt();
            Scanner pause = new Scanner(System.in);
            
            switch(opcao){             
            	case 1:
            		System.out.println("Digite o valor  ser inserido:");
            		int valor = 0;
            		Scanner inserirValor = new Scanner(System.in);
            		valor = inserirValor.nextInt();
            		arvoreBinBusca.inserir(valor);
            		break;
                
            	case 2:
            		arvoreBinBusca.imprimirArvore();
            		pause.nextLine();
            		break;
            		
            	case 3:
            		System.out.println("Digite o valor  ser pesquisado:");
            		int buscaValor = 0;
            		Scanner buscarValor = new Scanner(System.in);
            		buscaValor = buscarValor.nextInt();
            		arvoreBinBusca.busca(buscaValor);
            		pause.nextLine();
                    break;               	
            	default:
            		System.out.println("Op��o inv�lida");
            		pause.nextLine();
            		break;
            }            
        }while(true);

	}
}

