package composition;

/**
 * Difference between Aggregation and composition
 * 1.Dependency: Aggregation implies a relationship where the child can exist independently of the parent. 
 *      For example, Bank and Employee, delete the Bank and the Employee still exist. 
 *      whereas Composition implies a relationship where the child cannot exist independent of the parent. 
 *      Example: Human and heart, heart don’t exist separate to a Human
 * 2. Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
 * 3 .Type of association: Composition is a strong Association whereas Aggregation is a weak Association.
 * @author rohit
 *
 */
public class Engine {

	private String type;
	private int horsePower;
	
	public Engine(String type,int horsePower) {
		this.horsePower = horsePower;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
}
