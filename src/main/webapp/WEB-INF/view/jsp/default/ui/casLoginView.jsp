<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>集团登录统一页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}${'/login'}" method="post">
		<div>
			<label for="username">用户名</label> <input id="username" name="username" type="text" />
		</div>
		<div>
			<label for="password">密 码</label><input id="password" name="password" type="password" />
		</div>
		<div>
			<label>${pageContext.request.contextPath}</label>
		</div>
		<div>
			<input type="hidden" name="lt" value="${loginTicket}" /> <input type="hidden" name="execution" value="${flowExecutionKey}" /> <input
				type="hidden" name="_eventId" value="submit" /> <input name="submit" accesskey="l" value="登录" type="submit" /> <input name="reset" accesskey="c"
				value="重置" type="reset" />
		</div>
	</form>
</body>
</html>