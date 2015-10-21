package struts.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import struts.Controller.MemberController;

public class loginAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) 
					throws Exception {
		
		DynaValidatorForm dvf = (DynaValidatorForm)form;
		
		String id = dvf.get("id").toString();
		String passwd = dvf.get("pwd").toString();
		
		String mappingName = "fail";
		
		MemberController mc = new MemberController();
		
		boolean idcheck = mc.idCheck(id);
		boolean pwcheck = mc.passwdCheck(id, passwd);
		
		if (idcheck && pwcheck) {
			MemberBasicTO basic = new MemberBasicTO();
			
			
			mappingName = "success";
		}
		
		

			
		mapping.findForward(mappingName);
		
		
	}

}
