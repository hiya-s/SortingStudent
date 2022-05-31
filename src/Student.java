public class Student implements Comparable<Student> { 
private String name; 
private int studentID; 
	public Student(String n, int i) 
{ 
	name = n; 
	studentID = i; 
} 
	public String getName() 
	{ 
		return name; 
	} 
	public int getID() 
	{ 
		return studentID; 
	} 
	public String toString() 
	{ 
		return studentID +": " + name; 
	} 
	public boolean equals() 
	{ 
		return true; } 
@Override 
	public int compareTo(Student s) { 
		if(this.getID() > s.getID()) 
		{ 
			return 1; 
		} 
		else if(this.getID() < s.getID()) 
		{ 
			return -1; 
		} 
		return 0; 
		} 
}
