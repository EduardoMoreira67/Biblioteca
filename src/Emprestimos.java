import java.io.ObjectInputStream.GetField;

public class Emprestimos {  
	public static void main(String[] args){
    Livros l1, l2, l3, l4, l5;
    
    l1 = new Livros("O Iluminado", "Stephen King", 1977,"Terror",4, 5,true);
	l2 = new Livros("1984","George Orwell", 1949,"Sci Fi",10, 2,true);
	l3 = new Livros("A Revolução dos Bichos", "George Orwell", 1945,"Sci Fi",10, 4,false);
	l4 = new Livros("A Insustentável Leveza do Ser", "Milan Kundera", 1983,"Romance",18, 7,true);
	l5 = new Livros("Cem Anos de Solidão", "Gabriel Garcia Marquez", 1967,"Romance",18, 9,false);
	
	System.out.println(l1.exibirInfoDoLivro());
	System.out.println(l2.exibirInfoDoLivro());
	}
}
