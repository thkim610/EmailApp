package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("kim", "Taeho");
		em1.setAlternateEmail("thkim610@naver.com");
		
		System.out.println(em1.showInfo());

	}

}
