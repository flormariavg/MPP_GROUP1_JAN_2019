package lesson2.labs.prob4;

public class StudentSectionFactory {

	public Section createSection(int secNum, String courseName) {
		Section section = new Section();
		section.sectionNumber= secNum;
		section.courseName= courseName;
		return section;
	}
	public Student createStudent(String id, String name){
		Student student = new Student();
		student.id= id;
		student.name= name;
		return student;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade){
		TranscriptEntry transcriptEntry = new TranscriptEntry(s, sect);
		transcriptEntry.grade= grade;
		
		s.grades.add(transcriptEntry);
		sect.gradeSheet.add(transcriptEntry);
	}

}
