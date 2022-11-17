package LAb11Author;

public class Author {

	public String name;
	public String address;
	public int age;
	
	public Author(String name, String address, int age) {
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	public void printAuthor() {
		System.out.println("Author: " + this.name + " Address: " + this.address + " Age: " + this.age);
	}
}
