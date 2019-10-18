package lab2.qn2.prob2A;

public class GradeReport {
	private String grade;
	private Student st;
	
	GradeReport(Student st){
		this.st = st;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
