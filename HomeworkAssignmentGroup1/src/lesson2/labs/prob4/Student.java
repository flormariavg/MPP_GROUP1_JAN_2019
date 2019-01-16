package lesson2.labs.prob4;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades;
	
	public Student() {
		// TODO Auto-generated constructor stub
		grades= new ArrayList<>();
	}
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
}
