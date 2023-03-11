
public class LivroLivraria {
	//atributos
	
	private String titulo;
	private	String autor;
	private	int isbn;
	private	String genero;
	private	float preco;
	
	
	//construtores
	
	public LivroLivraria(){
		
	}
	
	//sobrecarregado
	public LivroLivraria(String titulo, String autor, int isbn, String genero, float preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.preco = preco;
	}
	
	
	//metodos de acesso - getters e setters
	
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
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	//metodos da classe
	public String imprimir() {
		return "Titulo: " + titulo + "\nAutor: " + autor +
				"\nISBN " + isbn + "\nGenero: " + genero + 
				String.format("\nPreço: R$ %2f \n", preco);
	}
	
	

}
