package users.model;

public class Admin extends User {

	@Override
	public String getetWelcomeMessage() {
		
		return "welcome" + getName() + "(" + getEmail() + ") in role Admin.";
	}

}
