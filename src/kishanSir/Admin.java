package kishanSir;

public class Admin extends User{

	String role;
	public Admin(String username, String password, String role) {
		super(username, password);
		this.role = role;
	}

	@Override
	void displayProfile() {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Role: "+role);
		
	}

}
