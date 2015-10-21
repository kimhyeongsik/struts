package struts.Beans;

import java.sql.Timestamp;

public class MemberSessionVO {

	private String num;
	private String name;
	private String id;
	private String passwd;
    private Timestamp regDate;
	private String email;

	public void setNum( String num ) { this.num = num; }
	public void setName( String name ) { this.name = name; }
	public void setId( String id ) { this.id = id; }
	public void setPasswd( String passwd ) { this.passwd = passwd; }
    public void setRegDate( Timestamp regDate ) { this.regDate = regDate; }
	public void setEmail( String email ) { this.email = email; }

	public String getNum() { return num; }
	public String getName() { return name; }
	public String getId() { return id; }
	public String getPasswd() { return passwd; }
    public Timestamp getRegDate() { return regDate; }
	public String getEmail() { return email; }

}	//end class