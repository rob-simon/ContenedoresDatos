package estructures;

public class ElementString {
	private String info;
	private ElementString seg;
	
	public ElementString(String info, ElementString seg) {
		super();
		this.info = info;
		this.seg = seg;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public ElementString getSeg() {
		return seg;
	}

	public void setSeg(ElementString seg) {
		this.seg = seg;
	}

	@Override
	public String toString() {
		return "Element [info=" + info + "]";
	}
	
	

}
