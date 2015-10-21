package struts.Controller;

import java.sql.SQLException;

import struts.DAO.memberBasicDAOOracle;

public class MemberController {

	public memberBasicDAOOracle getDAOOracle() throws Exception {
		return new memberBasicDAOOracle();
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
	
}
