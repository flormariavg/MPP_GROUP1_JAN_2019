package lesson2.labs.prob2A;

public class GradeReport {
	private Student student;
	private String grade;

	GradeReport(Student student) {
		this.grade = grade;
		this.student = student;
	}
    
     public void setStudent(Student st) {
    	student = st;
     }
	public Student getStudent() {
		return student;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	@Override 
	public String toString() {
		 return "Student: " + this.getStudent().getName() +" and Grade: "+ this.getGrade();
	}
}
