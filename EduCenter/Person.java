package EduCenter;

public class Person {
	private String name = "UnRegistered";
	private Date birthday ;
	private boolean gender;
	private String address = "UnRegistered";
	public Person(String name, Date birthday, boolean gender, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}
	
	public Person(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday.toString();
		
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String isGender() {
		if(gender==false) return "M";
		else return "FM";
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String normalizeName() {
		name = name.trim();
		name = name.replaceAll("\\s"," ");
		name = name.toLowerCase();
		String[] A = name.split(" ");
		String c="";
        for (String x : A) {
		c = c + (x.substring(0, 1).toUpperCase() + x.substring(1));
		c = c + " ";
	    }
        c=c.trim();
        return c;
	}
	public String getLastName() {
		String A = normalizeName();
		String[] B = A.split(" ");
		return B[2];
	}
	public int getAge(int currentYear) throws ArithmeticException{
		if( currentYear < birthday.year) {
			throw new ArithmeticException("Data is invalid");
			
		}
		else return currentYear - birthday.year;
	}
	public String toString() {
		
		return "Full Name: " + getName() + " Birthday: " + getBirthday() + " " +
				isGender() + " " + getAddress();
	}
	
	
	
	
}
