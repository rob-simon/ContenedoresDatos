package estructures;

public class Element <T>{
	private T info;
	private Element<T> seg;
	
	public Element(T info, Element<T> seg) {
		super();
		this.info = info;
		this.seg = seg;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Element<T> getSeg() {
		return seg;
	}

	public void setSeg(Element<T> seg) {
		this.seg = seg;
	}

	@Override
	public String toString() {
		return "Element [info=" + info + "]";
	}
	
}
