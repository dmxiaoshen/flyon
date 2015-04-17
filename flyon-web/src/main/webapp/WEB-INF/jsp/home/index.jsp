<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@ include file="/WEB-INF/jsp/common/base/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="decorator" content="default"/>
<%@ include file="/WEB-INF/jsp/common/base/html-jqGrid.jsp"%>
<title>主页</title>
<script type="text/javascript">
$(function(){
	
});
</script>
</head>
<body>
<h2>Hello World!  home主页 maven</h2>
<h1>用户${user.name }&nbsp;密码${user.password}</h1>
</body>
</html>
