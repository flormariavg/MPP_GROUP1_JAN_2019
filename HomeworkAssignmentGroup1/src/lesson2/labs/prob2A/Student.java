package lesson2.labs.prob2A;

public class Student {
 private GradeReport gradeReport;
 private String name;
 
 Student(String name){
	 this.name=name;
	 gradeReport = new GradeReport(this);
 }
 public String getName() { 
	 return name;
 }

 public GradeReport getGradeReport() {
	 return gradeReport;
 }
 
public void setGradeREport(GradeReport gradeReport) {
	this.gradeReport = gradeReport;
}
@Override 
public String toString() {
	 return "Student: " + this.getName() +" and Grade: "+ this.getGradeReport().getGrade();
}

}
