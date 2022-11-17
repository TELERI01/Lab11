package LAb11Author;

public class Book {

	public String name;
	public int price;
	
	public Book(String name, int age) {
		this.name=name;
		this.price=price;
	}
	public void printBook() {
		System.out.println("Book Name: " + this.name + " Price: " + this.price);
	}
}
