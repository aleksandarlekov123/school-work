package users.model;

public class Student extends User {
	private long sid;

	public Student() {
		super();

	}

	public Student(String name, String email, String password, long sid) {
		super(name, email, password, Role.STUDENT);
		this.setSid(sid);
	}

	public long getSid() {
		return sid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sid=").append(sid).append(", getEmail=").append(getEmail()).append(", getPassword=")
				.append(getPassword()).append(", getRole()=").append(getRole()).append("]");
		return builder.toString();
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getWelcomeMessage() {
		
		return "welcome" + getName() + "(" + getEmail() + ") in role Student.";
	}

	

	@Override
	public String getetWelcomeMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		Student s1 = new Student(" Sashko", "sashko@abv.bg", "sashko", 15);
		System.out.println(s1);
		System.out.println(s1.getWelcomeMessage());
		
	}
}
