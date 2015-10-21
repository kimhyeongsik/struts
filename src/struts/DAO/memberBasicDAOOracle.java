package struts.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.misc.StringMisc;
import struts.Beans.memberBasicTO;

public class memberBasicDAOOracle {
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
	private static ConnectionPoolDAO connDAO = new ConnectionPoolDAO().getInstance();
	
	
	public void addMember(memberBasicTO bean) throws Exception {
		Connection conn = null;
		
		
		
	}
	
	public boolean idCheck(String id) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = connDAO.getConn();
			stmt = conn.createStatement();
			
			String query = "SELECT num FROM tbl_member_basic WHERE id ="
			+ StringMisc.makeField(id);
			
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return true;
			}
			
 		} catch (SQLException sqlex) {
 			sqlex.printStackTrace();
 		} finally {
			if (stmt != null) { stmt.close(); }
			if (rs != null) { rs.close(); }
			if (conn != null) { conn.close(); }
		}
		
		return false;
		
	}
	
	
	public boolean passwdCheck(String id, String passwd) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = connDAO.getConn();
			stmt = conn.createStatement();
			
			String query = "SELECT num FROM tbl_member_basic WHERE id =" 
			+ StringMisc.makeField(id) + "AND pwd = " + StringMisc.makeField(passwd);
			
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return true;
			} 
			
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			if (stmt != null) { stmt.close(); }
			if (rs != null) { rs.close(); }
			if (conn != null) { conn.close(); }
		}
		
		return false;
		
		
	}

	
	public memberBasicTO retreiveBasic(String id) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		memberBasicTO bean = new memberBasicTO();

		try {
			conn = connDAO.getConn();
			stmt = conn.createStatement();
			
			String query = "SELECT * FROM tbl_member_basic WHERE id ="
					+ StringMisc.makeField(id);
			
			rs = stmt.executeQuery(query);
			
			
			if (rs.next()) {
				while(rs.next()) {
					bean.setNum(rs.getString("num"));
					bean.setId(rs.getString("id"));
					bean.setPasswd(rs.getString("passwd"));
					bean.setRegDate(rs.getTimestamp("reg_date"));
					bean.setPwdQuestion(rs.getString("pwd_question"));
					bean.setPwdAnswer(rs.getString("pwd_answer"));
					bean.setEmail(rs.getString("email"));
					bean.setAddress(rs.getString("address"));
				}
			}
						
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			if (stmt != null) { stmt.close(); }
			if (rs != null) { rs.close(); }
			if (conn != null) { conn.close(); }
		}
		
		return bean;

	}
	
	
	
	
		
}	// end class
