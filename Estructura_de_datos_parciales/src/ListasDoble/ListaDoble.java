package ListasDoble;



public class ListaDoble {
	
	private NodoDoble inicio;
	private NodoDoble fin;
	
	public ListaDoble(){
		inicio=null;
		fin=null;
	}
	

	
	public NodoDoble getInicio() {
		return inicio;
	}



	public void setInicio(NodoDoble inicio) {
		this.inicio = inicio;
	}



	public NodoDoble getFin() {
		return fin;
	}



	public void setFin(NodoDoble fin) {
		this.fin = fin;
	}

	public boolean vacio(){
		
		if(fin==null && inicio==null){
			return true;
			
		}else{
			return false;
		}
	 }	
	 
	
	
	public void insertarnodoadelante(musica valor)
	{
		if(inicio==null){
			inicio=new NodoDoble(valor,null,null);
			fin=inicio;
		}else{
			NodoDoble nuevo=new NodoDoble(valor,null,null);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}
	

	
	
	
	
	public void insertarnodoatras(musica valor){
		if(fin==null){
			fin=new NodoDoble(valor,null,null);
			inicio=fin;
		}else{
			NodoDoble nuevo=new NodoDoble(valor,fin,null);
			fin.setAnterior(nuevo);
			fin=nuevo;
		}
	}
	
	
	
	
	public musica eliminarprimernodo(){
		musica valor=inicio.getValor();
		inicio=inicio.getSiguiente();
		
		if(inicio!=null){
			inicio.setAnterior(null);
		}
		else{
			fin=null;
		}
		return valor;
	}
	
	
	
	
	public musica eliminarultimonodo(){
		musica valor=fin.getValor();
		fin=fin.getAnterior();
		
		if(fin!=null){
			fin.setSiguiente(null);
		}
		else{
			inicio=null;
		}
		return valor;
	}
	
	
	
	
	public  StringBuilder recorrerhaciaatras(){
		StringBuilder cadena =new  StringBuilder();
		NodoDoble temporal=inicio;
		cadena.append("NULL<--->");
		while(temporal!=null){
		cadena.append(temporal.getValor());
		cadena.append("<--->");
		temporal=temporal.getSiguiente();
	}
		cadena.append("NULL");
		return cadena;
	}
	
	
	
	public  StringBuilder recorrerhaciaadelante(){
		StringBuilder cadena =new  StringBuilder();
		NodoDoble temporal=fin;
		cadena.append("NULL<--->");
		while(temporal!=null){
		cadena.append(temporal.getValor());
		cadena.append("<--->");
		temporal=temporal.getSiguiente();
	}
		cadena.append("NULL");
		return cadena;
	}
		
	 
	 
	 
	
	

}
