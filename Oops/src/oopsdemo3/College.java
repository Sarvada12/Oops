package oopsdemo3;

public class College {

	String name;
	int id;
	String universiy;
	String course;
	public College(String name, int id, String universiy, String course) {
		super();
		this.name = name;
		this.id = id;
		this.universiy = universiy;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getUniversiy() {
		return universiy;
	}
	public String getCourse() {
		return course;
	}
	
	
}
