<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_menu.jsp"/>
	<h1>FILE: login</h1>
	
	<h2>Struts 2 - Login Application</h2>
    <s:actionerror />
 
    <s:form action="/login" method="post">
        <s:textfield name="username" key="label.username" size="20" />
        <s:password name="password" key="label.password" size="20" />
        <s:submit method="execute" key="label.login" align="center" />
    </s:form>
     
    <br>
    Username: admin, password: admin123

</body>
</html>