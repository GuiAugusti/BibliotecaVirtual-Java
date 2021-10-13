package biblioteca;

public class Ficcao extends Livros 
{

	private static final long serialVersionUID = 1L;

	
	public Ficcao(String titulo, int pags, String autor) 
	{
		super(titulo, pags, autor);
		this.genero = "Ficção";
	}
}
