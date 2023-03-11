import java.util.Scanner;

public class AppLivroLivrariaArrayListStatic_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		int menu;
		double vInicial, vFinal;
		//referencia para a class LivroLivraria
		LivroLivraria objLivro;
		
		String titulo, autor, genero;
		float preco;
		int isbn;
		
		do {
			
			exibirMenu();
			menu = entrada.nextInt();
				
			switch(menu) {
			
			case 1:// cadastro do livro
				System.out.println("====> CADASTRAR LIVRO");
				System.out.println("Digite  o titulo: ");
				titulo = entradaString.nextLine();
				System.out.println("Digite  o autor: ");
				autor = entradaString.nextLine();
				System.out.println("Digite  o genero: ");
				genero = entradaString.nextLine();
				System.out.println("Digite o ISBN: ");
				isbn = entrada.nextInt();
				System.out.println("Digite  o preço: ");
				preco = entrada.nextFloat();
				
				//Criar Objeto da classe
				objLivro = new LivroLivraria(titulo, autor, isbn, genero, preco);
				
				//guardar no ArrayList
				Acervo.adicionar(objLivro);
				break;
								
			case 2:// lISTA DE lIVROS
				System.out.println("=====> Listagem de Livros");
				System.out.println( Acervo.listar());
				break;
				
			case 3://Exclusão do Livro
				System.out.println("=====>Exclusão do Livro");
				System.out.println("Digite o Titulo do livro");
				titulo = entradaString.nextLine();
				
				if (! (Acervo.getListaLivros().isEmpty())) { //Acervo não vazio
					if(Acervo.remover(titulo)) {
						System.out.println("Livro removido com sucesso");
				}else {
					System.out.println("Titulo não encontrado");
				}
				}else {
					System.out.println("Não existem livros no acervo!!");
					
				}
				break;
				
			case 4:
				System.out.println("=====> Pesquisar pelo genero");
				System.out.println("Digite o genero");
				genero = entradaString.nextLine();
				System.out.println("Existem " + Acervo.pesquisar(genero) + "Livro(s) do genero"
						+ genero);
				break;
			
			case 5:
				System.out.println("=====> Pesquisar por faixa de preço");
				System.out.println("Digite a faixa de inicial e a final: ");
				vInicial = entrada.nextDouble();
				vFinal = entrada.nextDouble();
				
				System.out.println("Existem " + Acervo.pesquisar(vInicial, vFinal)
						+ "livro(s) com preço entre" 
						+ String.format("R$ %.2f e R$ %.2f \n", vInicial, vFinal));
				break;
				
			case 6:
				System.out.println("=====> Total em R$ de livros no Acervo");
				System.out.println("0 total é: " + 
						String.format("R$ %.2f \n", Acervo.calcularTotalAcervo()));
				break;
				
			case 7:
				System.out.println("Saindo......");
				break;
			
				default:
					System.out.println("Opção de Menu Invalida!!!");
			
			}
			
		}while(menu != 7);
		
		
	}//fim main
	
	static void exibirMenu() {
		System.out.println("========== LIVRO LIVRARIA ==========");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.println("3 - EXECUTAR LIVRO");
		System.out.println("4 - PESQUISAR POR GENERO");
		System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
		System.out.println("6 - CALCULAR TOTAL DO ACERVO");
		System.out.println("7 - SAIR");
		System.out.println("===> Escolha uma Opção: ");
	}

}
