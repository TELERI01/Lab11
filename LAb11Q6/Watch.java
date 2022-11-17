package LAb11Q6;

public class Watch {
	
	
	
	public void display() {
		System.out.println("Top of line, industry standard watches with fine gold finishes and long lasting battery life");
	}
	public static void main(String[] args) {
		Carson car1 = new Carson();
		Quartz quart1 = new Quartz();
		
		car1.display();
		car1.property();
		car1.type();
		
		quart1.display();
		quart1.property();
		quart1.type();
		
	}
	

}
