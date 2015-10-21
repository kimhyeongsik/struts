package struts.DAO;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionPoolDAO {
	
	private ConnectionPoolDAO poolDAO = new ConnectionPoolDAO();	
	
	public ConnectionPoolDAO() {};
	
	public ConnectionPoolDAO getInstance() {
		return poolDAO;
	}

	public Connection getConn() throws Exception {
			
		 Context initContext = new InitialContext();
		 Context envContext  = (Context)initContext.lookup("java:/comp/env");
		 DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		 Connection conn = ds.getConnection();
		 return conn;
		 
	  }
}
