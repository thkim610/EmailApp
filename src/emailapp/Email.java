package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	//�̸� ��ȯ
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("E-MAIL CREATE: " + this.firstName + this.lastName);
		
		this.department = setDepartment(); //�μ� ��ȯ
		System.out.println("Department: " + this.department);
	}
	//�μ� ����
	private String setDepartment() {
		System.out.println("*�μ������Է�* \n1 ��å\n2 ����\n3 �̸�\n0 ���� \n �μ��ڵ带 �Է��ϼ���: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "��å";
		}else if(depChoice == 2) {
			return "����";
		}else if(depChoice == 3) {
			return "�̸�";
		}else {
			return "";
		}
		
	}
	
	//�������� ��й�ȣ ����
	
	//���� �뷮 ����
	
	//���� �ּ� ����
	
	//��й�ȣ ����
}
