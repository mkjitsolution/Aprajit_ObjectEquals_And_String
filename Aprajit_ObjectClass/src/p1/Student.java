package p1;

public class Student {

	private String name;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			
			boolean isSameName = (this.name.equals(s.name));
			boolean isSameMarks = (this.marks == s.marks);
			
			return isSameMarks && isSameName;
		}
		else return false;
	}//end equals
	
	
	
	
	
}














