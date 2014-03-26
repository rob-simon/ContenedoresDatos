package estructures;

public class Pila <T>{
	private Element<T> top;

	public Pila() {
		super();
		top = null;
	}
	
	public boolean empty(){
		return top==null;
	}
	
	public void push(T x){
		Element<T> y=new Element<T>(x,top);
		top=y;
	}
	
	public T peek(){
		if(top!=null){
			return top.getInfo();
		}else{
			return null;
		}
	}
	
	public void pop(){
		if (top!=null){
			top=top.getSeg();
		}else{
			top=null;
		}
	}
	
	public T poll(){
		if (top!=null){
			T s= peek();
			pop();
			return s;
		}else{
			return null;
		}
	}

}
