package Lab11;

public class College {

	public String name;
	public String address;
	Student stu2;
	Department dep1;
	
	
	public College(String name, String address, Student stu2, Department dep1) {
		this.name=name;
		this.address=address;
		this.stu2=stu2;
		this.dep1=dep1;
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student("Tyler Lericos", "5104 Craig's Creek Drive", 19);
		Department dep2 = new Department("Computer Science ", "dr. Kelley");
		College Bellarmine = new College("Bellarmine", "Newburg Road ", stu1, dep2 );
		
		stu1.printStudent();
		dep2.printDep();
		System.out.println("Name: " + Bellarmine.name + "Address: " +Bellarmine.address);
		
		
	}
	
	
	
	
}
