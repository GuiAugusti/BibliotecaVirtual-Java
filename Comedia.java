package biblioteca;

public class Comedia extends Livros 
{

	private static final long serialVersionUID = 1L;

	
	public Comedia(String titulo, int pags, String autor) 
	{
		super(titulo, pags, autor);
		this.genero = "Comédia";
	}
}
