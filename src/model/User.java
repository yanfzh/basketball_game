package model;

public class User {

	private int id;
	private String userName;
	private String Password;
	
	
	
	public User() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
