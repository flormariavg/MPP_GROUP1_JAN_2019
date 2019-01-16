package lesson2.labs.prob2A;

public class GradeReport {
	private Student student;
	private String grade;

	GradeReport(String grade, String name) {
		this.grade = grade;
		this.student= new Student(name, this);
	}
     public void setStudent(Student st) {
    	student =st;
     }
	public Student getStudent() {
		return student;
	}

	public String getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+student.getName() +" || Grade: "+grade;
	}
}
