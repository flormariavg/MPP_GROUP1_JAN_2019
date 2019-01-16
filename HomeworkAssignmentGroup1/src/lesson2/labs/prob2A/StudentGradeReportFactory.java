package lesson2.labs.prob2A;



public class StudentGradeReportFactory {

 public static Student createStudent_GradeReport(String name, String grade) {
	 if(name == null) 
			throw new IllegalArgumentException("Student name cannot be null");
	 		Student student = new Student(name);
	 		GradeReport gradeReport = new GradeReport(student);
	 		gradeReport.setGrade(grade);
	 		student.setGradeREport(gradeReport);
	 		return student;

 }

}
