<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="model.domain.*" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>VIEW BOARD</title>
		<script type="text/javascript">
			function deleteReply(){
				
			}
		</script>
	</head>
	<body>
		<div>
			<form id="boardForm" action="deleteBoard1.do" method="post">
				<table>
					<tr>
						<th>NO.</th>
						<th>작성자</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성일</th>
					</tr>
					<tr>
						<td>${board1.no}</td>
						<td>${board1.id}</td>
						<td>${board1.title}</td>
						<td>${board1.body}</td>
						<td>${board1.wrDate}</td>
					</tr>
				</table>
				<input type="hidden" id="no" name="no" value="${board1.no}"/>
				<input type="submit" value="삭제"/>
			</form>
		</div>
		<div>
			<form id="replyForm" action="insertBoard1Reply.do" method="post">
				<table>
					<c:if test="${!empty board1ReplyList}">
						<c:forEach items="${board1ReplyList}" var="reply">
							<tr>
								<td>${reply.id}</td>
								<td>${reply.reply}</td>
								<td>${reply.reDate}</td>
								<td><input type="button" value="삭제" onclick="deleteReply()"/></td>
							</tr>
						</c:forEach>
						<tr>
							<td><input type="hidden" id="id" name="id" value="${sessionScope.id}"/></td>
							<td><input type="text" id="reply" name="reply" placeholder="댓글을 입력해주세요."/></td>
							<td><input type="hidden" id="no" name="no" value="${board1.no}"/></td>
							<td><input type="submit" value="등록"/></td>
						</tr>
					</c:if>
					<c:if test="${empty board1ReplyList}">
						<tr>
							<td><input type="hidden" id="id" name="id" value="${sessionScope.id}"/></td>
							<td><input type="text" id="reply" name="reply" placeholder="댓글을 입력해주세요."/></td>
							<td><input type="hidden" id="no" name="no" value="${board1.no}"/></td>
							<td><input type="submit" value="등록"/></td>
						</tr>
					</c:if>
				</table>
			</form>
		</div>
	</body>
</html>