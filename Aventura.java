package biblioteca;

public class Aventura extends Livros 
{

	private static final long serialVersionUID = 1L;

	
	public Aventura(String titulo, int pags, String autor) 
	{
		super(titulo, pags, autor);
		this.genero = "Aventura";
	}
}
