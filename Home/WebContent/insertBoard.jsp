<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.domain.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>WRITE BOARD</title>
		<script type="text/javascript">
			function back(){
				history.back();
			}
		</script>
	</head>
	<body>
		<div>
			<form action="insertBoard1.do" method="post" id="insertBoard1">
				<p>작성자<input type="text" id="id" name="id" value="${member.id}" readonly="readonly"/></p>
				<p>제목<input type="text" id="title" name="title" value=""/></p>
				<p>내용<textarea id="body" name="body" rows="20" cols="50"></textarea></p>
				<input type="submit" value="확인" />
				<input type="button" value="취소" onclick="back()"/>
			</form>
		</div>
	</body>
</html>