// Invalidate 는 세션을 삭제한다. 세션값을 "" 으로 바꾸는 removeAttribute와는 다르다.
// removeAttribute는 로그아웃하더라도 브라우저를 종료하지않으면 값이 남아있게된다.

package common.misc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.misc.StringMisc;
import struts.Beans.MemberSessionVO;
import struts.Beans.memberBasicTO;

import java.sql.Timestamp;

public class MemberSessionMisc {

	private static final String MEMBER_SESSION_VO = "_member.session.vo_";

	public static void setMemberSession(HttpServletRequest request, MemberSessionVO data) {
		// MemberSessionVO 의 빈즈데이터를 이용하여 멤버세션을 생성하는 메소드.

		if(data == null) {
			return;
		}

		HttpSession session = request.getSession();
		session.removeAttribute(MEMBER_SESSION_VO);
		session.setAttribute(MEMBER_SESSION_VO, data);

	}	// end method


	public static void setMemberSession(HttpServletRequest request, memberBasicTO data) {	
		// MemberBasicTo 형태의 데이터를 MemberSessionVO 형태로 변환시켜주는 메소드

		if(data == null) {
			return;
		}

		MemberSessionVO sessionData = getMemberSession(request);
		
		if(sessionData == null) {
			sessionData = new MemberSessionVO();
		}

		sessionData.setNum(data.getNum());
		sessionData.setName(data.getName());
		sessionData.setId(data.getId());
		sessionData.setPasswd(data.getPasswd());
		sessionData.setRegDate(data.getRegDate());
		sessionData.setEmail(data.getEmail());

		setMemberSession(request, sessionData);

	}	// end method


	public static MemberSessionVO getMemberSession(HttpServletRequest request) {
		// 사용자 세션에서 멤버세션만을 뽑아와 MemberSessionVO 형태로 리턴해주는 메소드.

		HttpSession session = request.getSession();
		return (MemberSessionVO) session.getAttribute(MEMBER_SESSION_VO);

	}	// end method


	public static void removeMemberSession(HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.removeAttribute(MEMBER_SESSION_VO);

	}	// end method


   public static String getNum( HttpServletRequest  request ) {
	
		MemberSessionVO data  = getMemberSession( request );

		if ( data == null )
				return null;

		return  data.getNum( );
   } //end 

  public static String getName( HttpServletRequest request ) {

		MemberSessionVO data  = getMemberSession( request );

		if ( data == null )
			return  null;

		return  data.getName( );
  }//end

  public static String getId ( HttpServletRequest request ) {

	  MemberSessionVO data  = getMemberSession( request );
	  
	  if ( data == null )
		  return null;

	  return  data.getId( );
  }//end

	public static String getPasswd( HttpServletRequest request ){

		 MemberSessionVO  data  = getMemberSession ( request );

		 if( data == null )
			 return null;

		 return data.getPasswd( );
	}//end

	public static Timestamp getRegDate ( HttpServletRequest  request ) {

		MemberSessionVO data  = getMemberSession( request );

		if (data == null )
			return null;

		return  data.getRegDate( );
	}//end
	
	public static String getEmail( HttpServletRequest request ){

		 MemberSessionVO  data  = getMemberSession( request );

		 if ( data == null )
			 return null;

		 return data.getEmail( );
	}//end


	public static boolean isLogin(HttpServletRequest request) {

		if(getMemberSession(request) == null)
			return false;

		return true;

	}	// end method



}	// end class


