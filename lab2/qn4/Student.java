package lab2.qn4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student {
	private String name;
	private String id;
	private List<TranscriptEntry> grades;

	Student(String id, String name) {
		this.id = id;
		this.name = name;
		grades = new ArrayList<>();
	}

	void addTranscriptEntries(TranscriptEntry tEntry) {
		grades.add(tEntry);
	}

	public Transcript getTranscript() {
		return new Transcript(grades, this);
	}
	
	public void setGrade(Section section, String grade) {
		StudentSectionFactory.newTranscriptEntry(this, section, grade);
	}
	
	public void addSection(Section section) {
		StudentSectionFactory.relateSection_Student(this, section);
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public List<TranscriptEntry> getGrades() {
		return Collections.unmodifiableList(grades);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
