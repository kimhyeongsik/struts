package struts.Form;

import org.apache.struts.validator.ValidatorForm;

public class loginForm extends ValidatorForm {
	
	private String username = null;
	private String pwd = null;
	private String pwd2 = null;
	private String email = null;
	
	// Setter, Getter - Auto Generated.
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd2() {
		return pwd2;
	}
	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
