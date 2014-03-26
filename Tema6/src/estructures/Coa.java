package estructures;

public class Coa {
	private ElementString eliminar;
	private ElementString insertar;
	
	public Coa() {
		super();
		this.eliminar = null;
		this.insertar = null;
	}
	
	public boolean empty(){
		return insertar==null;
	}
	
	public void add(String x){
		ElementString y=new ElementString(x, null);
		if(insertar!=null){
			insertar.setSeg(y);
		}
		insertar=y;
		if(eliminar==null){
			eliminar=y;
		}
	}
	
	public String element(){
		if(eliminar!=null){
			return eliminar.getInfo();
		}else{
			return null;
		}
	}
	
	public String remove(){
		if (eliminar!=null){
			String s= element();
			eliminar=eliminar.getSeg();
			if(eliminar==null){
				insertar=null;
			}
			return s;
		}else{
			return null;
		}
	}
	
	public void clear(){
		while(eliminar!=null){
			remove();
		}
	}
	
	public int size(){
		int contador=0;
		ElementString actual = eliminar;
		while(actual!=null){
			actual=actual.getSeg();
			contador++;
		}
		return contador;
	}
	
	
}
