package struts.Beans;

import java.sql.Timestamp;

/*
	num NUMBER( 10 ) NOT NULL,
	name VARCHAR2( 20 ) NOT NULL,
	id VARCHAR2( 12 ) NOT NULL,
	passwd VARCHAR2( 12 ) NOT NULL,
	reg_date DATE DEFAULT SYSDAT ,
	pwd_question VARCHAR2( 200 ),
	pwd_answer VARCHAR2( 100 ),
	email VARCHAR2( 50 ),
	mobile1 CHAR( 3 ),
	address VARCHAR2( 50 ),
	CONSTRAINT PK_mem_basic PRIMARY KEY ( id )
*/

public class memberBasicTO implements java.io.Serializable {

	private String num;
	private String name;
	private String id;
	private String passwd;
	private Timestamp regDate;
	private String pwdQuestion;
	private String pwdAnswer;
	private String email;
	private String mobile;
	private String address;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getPwdQuestion() {
		return pwdQuestion;
	}

	public void setPwdQuestion(String pwdQuestion) {
		this.pwdQuestion = pwdQuestion;
	}

	public String getPwdAnswer() {
		return pwdAnswer;
	}

	public void setPwdAnswer(String pwdAnswer) {
		this.pwdAnswer = pwdAnswer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}// end class