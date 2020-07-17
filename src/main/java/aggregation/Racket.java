package aggregation;

public class Racket {
	
	private String type;
	private int size;
	private int weight;
	
	public Racket(String type,int size,int weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
