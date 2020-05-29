package EduCenter;
import java.util.Scanner;
public class EduCenter {
	static Scanner sc = new Scanner(System.in);
	static Person[] person;
	static int m;
	public static Person[] readData() {
		String name;
		Date date;
		boolean gender;
		String address;
		int A; // quy dinh chuc danh
		String code;
		String email;
		String majors;
		double scoreAvg;
		String department;
		double salary;
		Date recruitment;
		 m = sc.nextInt();
		sc.nextLine();
		person = new Person[m];
		for(int i=0;i<m;i++) {
			name = sc.nextLine();
			date = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
			sc.nextLine();
			gender = sc.nextBoolean();
			sc.nextLine();
			address = sc.nextLine();
			A = sc.nextInt();
			if(A==1) {
				sc.nextLine();
				code = sc.nextLine();
				email =sc.nextLine();
				majors= sc.nextLine();
				scoreAvg = sc.nextDouble();
				sc.nextLine();
				person[i] = new Student(name,date,gender,address,code,email,majors,scoreAvg);
			}
			else {
				sc.nextLine();
				code = sc.nextLine();
				email =sc.nextLine();
				department = sc.nextLine();
				recruitment = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
				salary = sc.nextDouble();
				sc.nextLine();
				person[i] = new Staff(name,date,gender,address,code,email,salary,department,recruitment);
			}
		}
		return person;
	}
	public static void print() {
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i].toString());
		}
	}
	public static void option3() {
		int currentyear = sc.nextInt();
		for(int i=0;i<person.length;i++) {
				System.out.println(((Staff) person[i]).toString());
				System.out.println(((Staff) person[i]).getRealEarnings(currentyear));
		}
	}
	public static void option4() {
		int currentyear = sc.nextInt();
		double baseAmount = sc.nextDouble();
		for(int i=0;i<person.length;i++) {
		((Student) person[i]).toString();
		System.out.println(((Student) person[i]).getPayment(baseAmount));
		}
	}
	public static void option5() {
		String checkcode = sc.nextLine();
		for(int i=0;i<m;i++) {
			if( ( ((Student) person[i]).getStudentCode().equals(checkcode))) ((Student) person[i]).toString();
			else if(((Staff) person[i]).getStaffCode().equals(checkcode)) ((Staff) person[i]).toString();
			else System.out.println("Could not find the person with this code. ");
		}
	}
	public static void option6() {
		Person temp = new Person();
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				if(person[j].getLastName().compareTo(person[i].getLastName())<0) {
					temp = person[i];
					person[i]=person[j];
					person[j]=temp;
				}
			}
		}
	}
	public static void option7() {
		Student T = new Student();
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				if(  ((Student) person[j]).getScoreAvg()>((Student) person[i]).getScoreAvg()) {
					T = (Student) person[i];
					person[i]= person[j];
					 person[j]=T;
				}
			}
		}
	}
	public static void option8() {
		Staff TT = new Staff();
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
				if(  ((Staff) person[j]).getSalary()>((Staff) person[i]).getSalary()) {
					TT = (Staff) person[i];
					person[i]=person[j];
					person[j]=TT;
				}
			}
		}
	}
	public static void main(String[] args) {
	boolean flag = false;
	System.out.println("Chọn 1: Thực hiện phương thức public static Person[] readData()");
	System.out.println("Chọn 2: Hiển thị thông tin của tất cả các đối tượng trong mảng theo từng dòng,\r\n" + 
			"trong đó thông tin được lấy từ toString của đối tượng tương ứng.");
	System.out.println("Chọn 3: Nhập năm hiện tại, sau đó liệt kê danh sách các đối tượng Staff và mức thu\r\n" + 
			"nhập thực tế tương ứng lấy từ getRealEarnings. Chú ý xử lý nếu có ngoại lệ.");
	System.out.println("Chọn 4: Nhập năm hiện tại và một số thực là mức học phí cơ bản (baseAmount),\r\n" + 
			"sau đó liệt kê danh sách các đối tượng Student và mức phí cần đóng tương ứng lấy\r\n" + 
			"từ getPayment. Chú ý xử lý nếu có ngoại lệ.");
	System.out.println("Chọn 5: Nhập một mã gồm 8 chữ số (StudentCode hoặc StaffCode) sau đó in ra\r\n" + 
			"thông tin của đối tượng có studentCode hoặc staffCode tương ứng tương ứng trong\r\n" + 
			"mảng nếu tìm thấy. Ngược lại in ra “Could not find the person with this code”.");
	System.out.println(" Chọn 6: Sắp xếp mảng theo thứ tự tăng dần của getLastName().");
	System.out.println("Chọn 7: Tách và sắp xếp mảng các Student theo thứ tự tăng dần của scoreAvg.");
	System.out.println("Chọn 8: : Tách và sắp xếp mảng các Staff theo thứ tự tăng dần của salary.");
	System.out.println("Chọn 9: Thoát.");
	do {
		System.out.println("Nhap lua chon cua ban: ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			  readData() ;
			  break;
		case 2:
			  print();
			  break;
		case 3:
			option3();
			break;
		case 4:
			option4();
			break;
		case 5:
			option5();
			break;
		case 6:
			option6();
			break;
		case 7:
			option7();
			break;
		case 8:
			option8();
			break;
		
		case 9:
		default:
			flag = true;
	}	
	}while(flag==false);
}
}
