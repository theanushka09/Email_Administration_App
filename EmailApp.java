package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email e1 = new Email("Anushka", "Singh");
		e1.setAltEmail("anushkanit2002@gmail.com");
		e1.changePassword("Anushka123");
		System.out.println(e1.showInfo());

	}

}
