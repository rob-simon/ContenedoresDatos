package estructures;

public class PilaString {
	private Element top;

	public PilaString() {
		super();
		top = null;
	}
	
	public boolean empty(){
		return top==null;
	}
	
	public void push(String x){
		Element y=new Element(x,top);
		top=y;
	}
	
	public String peek(){
		if(top!=null){
			return top.getInfo().toString();
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
	
	public String poll(){
		if (top!=null){
			String s= peek();
			pop();
			return s;
		}else{
			return null;
		}
	}

}
