package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private String companysuffix = "company.com";
	private int mailboxCapacity = 100;
	private String alternateEmail;
	
	//constructor to receive first name & last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname= lastname;
		
		//call method asking for dept - return dept
		this.department= setDepartment();		
		
		//call method that returns random password
		this.password= randomPassword(8);
		System.out.println("Current Password: "+this.password);
		
		//generate email
		email= firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix ;
	}
	
	// ask for department
	private String setDepartment() {
		System.out.print("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department: ");
		Scanner in = new Scanner(System.in);
		int dept= in.nextInt();
		if(dept == 1) {
			return "sales";
		}else if(dept==2) {
			return "development";
		}else if(dept==3){
			return "accounting";
		}else {
			return "";
		}
	}
	
	//generate random password
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand= (int)(Math.random()* passwordset.length());
			password[i]= passwordset.charAt(rand);
		}
		return new String(password);
	}
	
	//set mailbox capacity
	public void setMailCapacity(int cap) {
		this.mailboxCapacity = cap;
	}
	
	//set alternate email
	public void setAltEmail(String alt) {
		this.alternateEmail = alt;
	}
	
	//change the password
	public void changePassword(String newpass) {
		this.password = newpass;
	}
	
	public int getMailCapacity() {
		return mailboxCapacity;
	}
	
	public String getAltEmail() {
		return alternateEmail;
	}
	
	public String getpassword() {
		return password;
	}
	
	public String showInfo() {
		return "NAME: "+firstname+" "+lastname+
				"\nEMAIL: "+email+
				"\nPASSWORD: "+password+
				"\nMAILBOX CAPACITY: "+mailboxCapacity+" mb";
	}

}
