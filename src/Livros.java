
public class Livros {
	private String titulo;
	private String autor;
	private int    anopubli;
	private String categoria;
	private int prateleira;
	private int estante;
	private boolean emprestado;
	
	
	public Livros(String titulo, String autor, int anopubli, String categoria, int prateleira, int estante, boolean emprestado) {
		this.titulo = titulo;
		this.autor  = autor;
		this.anopubli = anopubli;
		this.categoria = categoria;
		this.prateleira = prateleira;
		this.estante = estante;
		this.emprestado = emprestado;

	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnopubli() {
		return anopubli;
	}
	public void setAnopubli(int anopubli) {
		this.anopubli = anopubli;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public boolean emprestimo () {
		if (emprestado) {
			emprestado = false;
			return true;            //*deu certo o emprestimo
		}
		 else { 
			return false;
		 }	
	    } 
         public void devolver() {
		 emprestado = true;
		 }
         public String exibirInfoDoLivro() {
        	    String  texto = "Titulo: " +titulo+"("+autor+") /"+anopubli+ "\n"+
                                 "Categoria: "+categoria+ "\n" +
        	    		         "Localização: E: "+estante+" P: "+prateleira+"\n"+
                                 ((emprestado)? "Disponível": "Emprestado");       
        return texto;
         }
}

