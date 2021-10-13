package biblioteca;

import java.io.Serializable;

public abstract class Livros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String titulo,autor;
	private int pags;
	protected String genero;
	
	public Livros(String titulo, int pags, String autor) {
		this.titulo = titulo;
		this.pags = pags;
		this.autor = autor;
	}
	  public String toString()
	  {
	    String livro = "";
	    livro += "T�tulo: " + this.titulo + "\n";
	    livro += "Autor: " + this.autor + "\n";
	    livro += "N�mero de P�ginas: " + this.pags + "\n";
	    livro += "G�nero: " + this.genero + "\n";
	    return livro;
	  }
	  
	  
	public String getTitulo() 
	{
		return titulo;
	}
	
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
	
	public String getAutor() 
	{
		return autor;
	}
	
	public void setAutor(String autor) 
	{
		this.autor = autor;
	}
	
	public int getPags() 
	{
		return pags;
	}
	
	public void setPags(int pags) 
	{
		this.pags = pags;
	}
	  
	  
	  
	  
	  
}
