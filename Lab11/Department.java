package Lab11;

public class Department {

	public String name;
	public String chair;
	
	//Constructor
	
	public Department(String name, String chair) {
		this.name=name;
		this.chair=chair;
	}
	
	public void printDep() {
		System.out.println("Name: "+this.name + ", chair:" + this.chair);
	}
	
	
	
}
