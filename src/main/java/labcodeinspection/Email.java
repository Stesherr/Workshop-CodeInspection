package labcodeinspection;

public class Email {

	private final String m_firstName;
	private final String m_lastName;
	private String password;
	private String department;
	private final int defaultpasswordLength = 8;
	private String email;

	/**
	* email
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	* showInfo
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	* setDepartment
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	* generateEmail
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(LOCALE.ROOT) + this.m_lastName.toLowerCase(LOCALE.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	* getM_firstName
	*/
	public String getM_firstName() {
		return m_firstName;
	}

	/**
	* getM_lastName
	*/
	public String getM_lastName() {
		return m_lastName;
	}

	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}
}
