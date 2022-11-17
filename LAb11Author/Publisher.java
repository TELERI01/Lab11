package LAb11Author;

public class Publisher {

	public String name;
	public String city;
	public int publisherID;
	
	public Publisher(String name, String city, int publisherID) {
		this.name=name;
		this.city=city;
		this.publisherID=publisherID;
	}
	public void printPublisher() {
		System.out.println("Name: " + this.name + " City: " + this.city + " ID: " + this.publisherID);
	}
	
	public static void main(String[] args) {
		Author author1 = new Author("Taylor ", "8209 Prism Lane", 28);
		Book book1 = new Book("Heart of Gold", 12);
		Publisher pub1 = new Publisher("Penguin Publishers ", "Louisville", 1200);
		
		author1.printAuthor();
		book1.printBook();
		pub1.printPublisher();
	}
	
	
}
