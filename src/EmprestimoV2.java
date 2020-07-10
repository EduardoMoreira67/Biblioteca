/*  Versao 2 - Interação com o usuário através de Interface Gráfica (JOptionPane) 
 */ 
import javax.swing.JOptionPane;
   public class EmprestimoV2 { 

 	public static void main(String[] args) { 
 		 
		//Scanner teclado = new Scanner(System.in); 
	    int numLivro; 
	    Livros acervo[];   // aqui eu declaro uma lista de livros / um conjunto de livros / um array de livros 
		// qual o tamanho deste conjunto? 
	 
	        acervo = new Livros[10]; // isso aqui equivale a ter criado 10 variáveis do tipo Livro 
	        acervo[0] = new Livros("Java Basico", "Isidro", 2020, "Terror", 1, 1, true); 
	        acervo[1] = new Livros("Java Intermediario", "Isidro", 2020, "Terror Master", 1, 2, true); 	       
		    acervo[2] = new Livros("Bancos de Dados", "Jose", 2020, "Desenvolvimento", 2, 1, true); 
	   		acervo[3] = new Livros("Desenvolvimento Web", "Pedro", 2019, "Desenvolvimento", 2, 2, true); 
	        acervo[4] = new Livros("Redes", "Tanembaum", 2000, "Infra", 3,1, true); 
	        acervo[5] = new Livros("Sistemas Operacionais", "Silberchatz", 2000, "Infra", 3,1, true); 
	        acervo[6] = new Livros("Inteligencia Artificial", "Charles", 2000, "Conceitos", 4,1, true); 
	 		acervo[7] = new Livros("Compiladores", "Aho", 1978, "Conceito", 5,1, true); 
	 		acervo[8] = new Livros("Algoritmos", "Cormen	", 1990, "Fundamentos", 6,1, true); 
	 		acervo[9] = new Livros("Estruturas de Dados", "Tenembaum", 1980, "Fundmamentos", 6,2, true); 
	 		 
	 		do { 
	 			//System.out.println("Qual livro? (0-9)"); 
	 			//numLivro = teclado.nextInt(); 
	 			String texto = JOptionPane.showInputDialog("Qual Livro (0-9)?"); 
	 			numLivro = Integer.parseInt(texto); 
	 			if (numLivro < -1 || numLivro >= 10) { 
	 				//System.out.println("Opcao Invalida!"); 
	 				JOptionPane.showMessageDialog(null, "Opcao Invalida!"); 
	 				continue; 
	 			} 
	 			if (numLivro == -1) { 
	 				break; 
	 			} 
	 			 
	 			boolean deuCerto = acervo[numLivro].emprestimo(); 
	 			if (deuCerto) { 
	 				JOptionPane.showMessageDialog(null, "Emprestimo Efetuado Com sucesso"); 
	 				JOptionPane.showMessageDialog(null, acervo[numLivro].exibirInfoDoLivro()); 
	 				//System.out.println("Emprestimo Efetuado com sucesso"); 
	 				//System.out.println(acervo[numLivro].exibirInfoDoLivro()); 
	 			} 
	 			else { 
					JOptionPane.showMessageDialog(null, "Lamento, mas o livro "+acervo[numLivro].getTitulo()+" está indisponível" ); 
	 				//System.out.println("Lamento, mas o livro "+acervo[numLivro].getTitulo()+" está indisponível"); 
	 			} 
	 			 
	 		} while (numLivro != -1); 
	 
	 	} 
} 

