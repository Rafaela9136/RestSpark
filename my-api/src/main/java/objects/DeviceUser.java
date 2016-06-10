package objects;

public class DeviceUser {
	private String nickName;
	private String password;
	private String firstName;
	private String lastName;
	
	public DeviceUser(String nick,String pword,String fname,String lname) {
		setNickName(nick);
		setPassword(pword);
		setFirstName(fname);
		setLastName(lname);
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
