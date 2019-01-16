package lesson2.labs.prob2A;

public class Student {
 private GradeReport gradeReport;
 private String name;
 
 Student(String name, GradeReport gr){
	 this.name=name;
     this.gradeReport= gr;
 
 }
 public String getName() { 
	 return name;
 }

 public GradeReport getGradeReport() {
	 return gradeReport;
 }
}
