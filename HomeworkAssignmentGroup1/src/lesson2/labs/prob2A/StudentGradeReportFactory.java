package lesson2.labs.prob2A;

public class StudentGradeReportFactory {
	static GradeReport gr;
	static Student s;

	public static GradeReport createStudent_GradeReport(String name, String grade) {
		gr = new GradeReport(grade, name);
		return gr;

	}

}
