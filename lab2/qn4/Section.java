package lab2.qn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Section {
	private String courseName;
	private int sectionNumber;
	private List<TranscriptEntry> gradeSheet;
	
	Section(int secNum, String courseName)
	{
		this.courseName = courseName;
		sectionNumber = secNum;
		gradeSheet = new ArrayList<>();
	}
	
	public void addGradeSheet(TranscriptEntry tEntry)
	{
		gradeSheet.add(tEntry);
	}
	
	public void setGrade(Student student, String grade) {
		StudentSectionFactory.newTranscriptEntry(student, this, grade);
	}
	
	public void addStudent(Student student) {
		StudentSectionFactory.relateSection_Student(student, this);
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	
	public List<TranscriptEntry> getGradeSheet() {
		return Collections.unmodifiableList(gradeSheet);
	}
	@Override
	public int hashCode() {
		return Objects.hash(sectionNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Section))
			return false;
		Section other = (Section) obj;
		if (sectionNumber != other.sectionNumber)
			return false;
		return true;
	}
	
	
}
