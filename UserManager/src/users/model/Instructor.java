package users.model;

public class Instructor extends User {

	@Override
	public String getetWelcomeMessage() {

		return "welcome" + getName() + "(" + getEmail() + ") in role Instructor.";
	}

}
