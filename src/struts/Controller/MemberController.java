package struts.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import struts.Beans.memberBasicTO;
import struts.DAO.memberBasicDAOOracle;

public class MemberController {

	public memberBasicDAOOracle getDAOOracle() throws Exception {
		return new memberBasicDAOOracle();
	}
	
	public boolean idCheck(String id) throws Exception {
		memberBasicDAOOracle dao = getDAOOracle();
		
		try {
			return dao.idCheck(id);
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			return false;
		}
	}
	
	public boolean passwdCheck(String id, String passwd) throws Exception {
		
		memberBasicDAOOracle dao = getDAOOracle();
		
		try {
			return dao.passwdCheck(id, passwd);
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			return false;
		}
				
	}
	
	
	
	public memberBasicTO retreiveBasicTO(String id) throws Exception {

		memberBasicDAOOracle dao = getDAOOracle();
		
		try {
			return dao.retreiveBasic(id);
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			return null;
		}
				
	}
	
	
}
