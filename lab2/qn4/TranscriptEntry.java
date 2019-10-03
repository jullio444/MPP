package lab2.qn4;

import java.util.Objects;

public class TranscriptEntry {
	private Student student;
	private Section section;
	private String grade;
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	TranscriptEntry(Student student, Section section) {
		this.student = student;
		this.section = section;
	}
	
	public String getGrade() {
		return grade;
	}

	public Student getStudent() {
		return student;
	}
	
	public Section getSection() {
		return section;
	}
	
	@Override
	public String toString() {
	  return "Student: " + student.getName() + "\n"
				+ "Course name: " + section.getCourseName() + "\n"
				+ "Section number: " + section.getSectionNumber() + "\n"
				+ "Grade: " + grade + "\n";
				
	}
	@Override
	public int hashCode() {
		return Objects.hash(student, section);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof TranscriptEntry))
			return false;
		TranscriptEntry other = (TranscriptEntry) obj;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
	
}
