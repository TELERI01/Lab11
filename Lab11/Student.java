package Lab11;

public class Student {

	public String name;
	public String address;
	public int age;
	
	public Student(String name, String address, int age) {
		this.name=name;
		this.address=address;
		this.age=0;
	}
	
	public void printStudent() {
		System.out.println(this.name+ ", address" + this.address + ", age" + this.age);	
	}
	
	
}
