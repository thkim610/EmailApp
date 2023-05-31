package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultpasswordLength=10;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "thcompany.com";
	
	//�̸� ��ȯ
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("E-MAIL CREATE: " + this.firstName + this.lastName);
		
		//�μ� ��ȯ
		this.department = setDepartment(); 
		System.out.println("Department: " + this.department);
		
		//���� ��й�ȣ ���� �޼���
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("��й�ȣ : " + this.password);
		
		//�̸��� �ּ� ����
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("�̸��� �ּ�: " + email);
		
	}
	//�μ� ����
	private String setDepartment() {
		System.out.println("*�μ������Է�* \n1 ȸ��\n2 ����\n3 �λ�\n0 ���� \n �μ��ڵ带 �Է��ϼ���: ");
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
	
	//�������� ��й�ȣ ����
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length]; // �Է¹��� ��й�ȣ(����)�� �迭�� ����
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); // passwordSet�� ���ڿ� �� ������ ���� �ϳ��� password �迭�� ���ʴ�� ����
		}
		return new String (password); //���� length������ ��й�ȣ�� ��ȯ
	}
	//���� �뷮 ����
	
	//���� �ּ� ����
	
	//��й�ȣ ����
}
