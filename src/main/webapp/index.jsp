<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>--index.jsp页面--</title>
</head>
<body>
	<!-- 下面两种写法都可以访问	 -->
	<%=basePath %><br/>
	<a href="<%=basePath %>category_update.action">访问update</a><br/>
	<a href="<%=basePath %>category_save.action">访问save</a><br/>
	
</body>
</html>