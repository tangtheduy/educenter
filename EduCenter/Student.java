package EduCenter;

public class Student extends Person {
	private String studentCode;
	private String email;
	private String majors;
	private double scoreAvg;
	public Student() {
		super();
		
	}
	public Student(String name, Date birthday, boolean gender, String address,String studentCode,String email, String majors, double scoreAvg) {
		super(name, birthday, gender, address);
		this.studentCode = studentCode;
		this.email = email;
		this.scoreAvg = scoreAvg;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMajors() {
		return majors;
	}
	public void setMajors(String majors) {
		this.majors = majors;
	}
	public double getScoreAvg() {
		return scoreAvg;
	}
	public void setScoreAvg(double scoreAvg) {
		this.scoreAvg = scoreAvg;
	}
	public double getPayment(double baseAmount) {
		if(scoreAvg<4.0) return baseAmount*1.5;
		else if(scoreAvg>=4.0&&scoreAvg<8) return baseAmount;
		else if(scoreAvg>=8&&scoreAvg<9) return baseAmount*0.75;
		else return baseAmount*0.5;
		
	}
	public String toString() {
		return "Student Code: " + studentCode + " email " + email + " Average score" +
		String.valueOf(scoreAvg) + " Majors: " + majors + "Full Name: " + getName() + " Birthday: " + getBirthday() + " " +
		isGender() + " " + getAddress();
	}
	
}
