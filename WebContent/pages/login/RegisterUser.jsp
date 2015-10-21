<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>User Registration Form</title>
</head>
<body>

<h2>Struts Test - Login Part</h2>

<b>User Registration Form</b>

<font color="red">
<html:errors/>
</font>

<html:form action="/Register">

<br/>
<bean:message key="label.user.username"/> :
<html:text property="username" size="20"/>

<br/>
<bean:message key="label.user.pwd"/> :
<html:password property="pwd" size="20"/>

<br/>
<bean:message key="label.user.pwd2"/> :
<html:password property="pwd2" size="20"/>

<br/>
<bean:message key="label.user.email"/> :
<html:text property="email" size="50"/>

<br/><br/>
<html:submit/>




</html:form>


</body>
</html>