package lab2.qn2.prob2A;

public class Student {
	private String name;
	private GradeReport GReport;
	
	public Student(String name){
		this.name = name;
		GReport = new GradeReport(this);
	}

	public void setGrade(String grade) {
		this.GReport.setGrade(grade);
	}
	
	@Override
	public String toString() {
		return name+" Grade:"+GReport.getGrade();
	}
}
