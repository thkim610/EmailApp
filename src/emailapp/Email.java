package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//이름 반환
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("E-MAIL CREATE: " + this.firstName + this.lastName);
		
		this.department = setDepartment(); //부서 반환
		System.out.println("Department: " + this.department);
	}
	//부서 묻기
	private String setDepartment() {
		System.out.println("*부서정보입력* \n1 직책\n2 직무\n3 이름\n0 없음 \n 부서코드를 입력하세요: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "직책";
		}else if(depChoice == 2) {
			return "직무";
		}else if(depChoice == 3) {
			return "이름";
		}else {
			return "";
		}
		
	}
	
	//랜덤으로 비밀번호 생성
	
	//메일 용량 설정
	
	//메일 주소 변경
	
	//비밀번호 변경
}
