package author;

public class User {
	public User(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	private String loginId;
	private String password;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User u = (User)obj;
			return loginId.equals(u.loginId);
		}
		return false;
	}
	
	
	

}
