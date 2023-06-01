package emailapp;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultpasswordLength=10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "thcompany.com";
	
	//이름 반환
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("E-MAIL CREATE: " + this.firstName + this.lastName);
		
		//부서 반환
		this.department = setDepartment(); 
//		System.out.println("Department: " + this.department);
		
		//랜덤 비밀번호 생성 메서드
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("비밀번호 : " + this.password);
		
		//이메일 주소 생성
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//		System.out.println("이메일 주소: " + email);
		
	}
	//부서 묻기
	private String setDepartment() {
		System.out.println("*부서정보입력* \n1 회계\n2 영업\n3 인사\n0 없음 \n 부서코드를 입력하세요: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "acct";
		}else if(depChoice == 2) {
			return "sales";
		}else if(depChoice == 3) {
			return "dev";
		}else {
			return "";
		}
		
	}
	
	//랜덤으로 비밀번호 생성
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length]; // 입력받은 비밀번호(길이)를 배열로 저장
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); // passwordSet의 문자열 중 랜덤한 문자 하나를 password 배열에 차례대로 저장
		}
		return new String (password); //최종 length길이의 비밀번호를 반환
	}
	
	//메일 용량 설정
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//메일 주소 변경
	public void setAlternateEmail(String altEmail) {
		this.email = altEmail;
	}
	
	//비밀번호 변경
	public void changePassword(String password) {
		this.password = password;
	}
		
	 public int getMailboxCapacity() {return mailboxCapacity;}
	 public String getAlternateEmail() {return alternateEmail;}
	 public String getPassword() {return password;}
	 
	 public String showInfo() {
		 return "DISPALY NAME: " + firstName + " " + lastName +
				 "\nCOMPANY EMAIL: " + email +
				 "\nMAILBOX CAPACITY: " + mailboxCapacity +"mb";
	 }
}
