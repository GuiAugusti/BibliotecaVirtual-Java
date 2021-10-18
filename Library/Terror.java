package biblioteca;

public class Terror extends Livros 
{

	private static final long serialVersionUID = 1L;

	
	public Terror(String titulo, int pags, String autor) 
	{
		super(titulo, pags, autor);
		this.genero = "Terror";
	}
}
