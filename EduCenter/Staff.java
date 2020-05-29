package EduCenter;

public class Staff extends Person {
	private String staffCode;
	private String email;
	private double salary;
	private String department;
	private Date recruitment;
	public Staff(String name, Date birthday, boolean gender, String address, String staffCode, String email,
			double salary, String department, Date recruitment) {
		super(name, birthday, gender, address);
		this.staffCode = staffCode;
		this.email = email;
		this.salary = salary;
		this.department = department;
		this.recruitment = recruitment;
	}
	public Staff() {
		
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getRecruitment() {
		return recruitment;
	}
	public void setRecruitment(Date recruitment) {
		this.recruitment = recruitment;
	}
	public int getSeniority(int currentYear) throws ArithmeticException{
		if( currentYear < recruitment.year) {
			throw new ArithmeticException("Data is invalid");
			
		}
		else return currentYear - recruitment.year;
	}
	public double getRealEarnings(int currentYear) {
		if(getSeniority(currentYear)>5) return salary+ salary*(getSeniority(currentYear) - 5)*3.75/100;
		else return 0;
	}
	public String toString() {
		return "Staff Code: " + staffCode + " email " + email + " Salary " +
				String.valueOf(salary) + "Department: " + department + "Full Name: " + getName() + " Birthday: " + getBirthday() + " " +
					isGender() + " " + getAddress();
	}
}
