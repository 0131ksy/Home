<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SUCCESS</title>
	</head>
	<body>
		<h1>${member.id} LOGIN SUCCESS</h1>
		<form action="getBoard1List.do" method="post">
			<input type="submit" value="ENTER"/>
		</form>
	</body>
</html>