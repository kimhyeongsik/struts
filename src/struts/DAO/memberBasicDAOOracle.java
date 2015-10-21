package struts.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.misc.StringMisc;
import struts.Beans.memberBean;

public class memberBasicDAOOracle {
	/*
    num NUMBER( 10 ) NOT NULL,
    name VARCHAR2( 20 ) NOT NULL,
    ssn1 CHAR( 6 ) NOT NULL,
    ssn2 CHAR( 7 ) NOT NULL,
    id VARCHAR2( 12 ) NOT NULL,
    passwd VARCHAR2( 12 ) NOT NULL,
    reg_date DATE DEFAULT SYSDATE NOT NULL,
    pwd_question VARCHAR2( 200 ) NOT NULL,
    pwd_answer VARCHAR2( 100 ) NOT NULL,
    email VARCHAR2( 50 ) NOT NULL,
    mobile1 CHAR( 3 ),
    mobile2 VARCHAR2( 4 ),
    mobile3 CHAR( 4 ),
    CONSTRAINT PK_mem_basic PRIMARY KEY ( id )
*/
	private static ConnectionPoolDAO connDAO = new ConnectionPoolDAO().getInstance();
	
	
	public void addMember(memberBean bean) throws Exception {
		Connection conn = null;
		
		
		
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
	
		
}
