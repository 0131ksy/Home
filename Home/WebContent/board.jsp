<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>BOARD</title>
		<script type="text/javascript">
			function viewBoard1(no){
				var boardForm = document.getElementById("boardForm");
				document.getElementById("no").value = no;
				boardForm.submit();
			}
		</script>
	</head>
	<body>
		<div>
			<form id="boardForm" action="viewBoard1.do" method="post">
				<table>
					<tr>
						<th>NO.</th>
						<th>작성자</th>
						<th>제목</th>
						<th>작성일</th>
					</tr>
					<c:if test="${!empty board1List }">
						<c:forEach items="${board1List}" varStatus="inx" var="board">
							<c:set var="index" value="${inx.index}" />
							<tr>
								<td><c:out value ='${board.no}'/><input type="hidden" id="no" name="no" value="<c:out value ='${board.no}'/>"/></td>
								<td><c:out value ='${board.id}'/></td>
								<td onclick="viewBoard1('${board.no}')" ><c:out value ='${board.title}'/></td>
								<td><c:out value ='${board.wrDate}'/></td>
							</tr>
						</c:forEach>
					</c:if>
				</table>
			</form>
			<a href="insertBoard.jsp">새글 작성</a>
		</div>
	</body>
</html>