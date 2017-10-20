package ListasDoble;



public class musica {
	
	private String tipo;
	private	String cancion;
	private String album;
	private String autor;
	private String id;
	
	public  String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Identificador: "+this.id+" Autor: "+this.autor+" Cancion: "+this.cancion+" Tipo:  "+this.tipo+" Album:  "+this.album;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		musica temporal=(musica) o;
		return this.id.compareTo(temporal.getId());
	}
	
}
