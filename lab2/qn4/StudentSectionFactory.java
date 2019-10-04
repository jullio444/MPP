package lab2.qn4;

import java.util.ArrayList;
import java.util.List;

public class StudentSectionFactory {
	private static List<Student> students = new ArrayList<>(); 
	private static List<Section> sections = new ArrayList<>();
	
	public static Section createSection(int secNum, String courseName)
	{
		if(secNum <= 0 || courseName == null) 
			throw new IllegalArgumentException("Invalid input");
		Section section = new Section(secNum, courseName);
		sections.add(section);
		return section;
	}
	public static Student createStudent(String id, String name)
	{
		if(id == null || name == null) 
			throw new IllegalArgumentException("Invalid input");
		Student student = new Student(id, name);
		students.add(student);
		return student;
	}
	
	public static void newTranscriptEntry(Student stu, Section sect, String grade)
	{
		if(stu == null || sect == null || grade == null) 
			throw new IllegalArgumentException("Invalid input");
		TranscriptEntry transcriptEntry = findTranscriptEntry(stu, sect); 
		if(transcriptEntry == null)
		{
			transcriptEntry = new TranscriptEntry(stu, sect);
			stu.addTranscriptEntries(transcriptEntry);
			sect.addGradeSheet(transcriptEntry);
		}
		transcriptEntry.setGrade(grade);
	}
	
	public static void relateSection_Student(Student student, Section section) {
		TranscriptEntry tEntry = new TranscriptEntry(student, section);
		student.addTranscriptEntries(tEntry);
		section.addGradeSheet(tEntry);
	}
	
	public static boolean studentExists(String id) {
		return (findStudent(id) != null);
	}
	
	public static boolean sectionExists(int sectionNum) {
		return (findSection(sectionNum) != null);
	}
	
	public static Student findStudent(String id) {
		for(Student student: students) {
			if(student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}
	public static Section findSection(int secNum) {
		for(Section section: sections) {
			if(section.getSectionNumber() == secNum) {
				return section;
			}
		}
		return null;
	}
	
	public static List<Student> getStudents() {
		return students;
	}
	
	public static List<Section> getSections() {
		return sections;
	}
	
	public static TranscriptEntry findTranscriptEntry(Student student, Section section) {
		for(TranscriptEntry tEntry: student.getGrades()) {
			if(tEntry.getSection().equals(section)) {
				return tEntry;
			}
		}
		return null;
	}

}
