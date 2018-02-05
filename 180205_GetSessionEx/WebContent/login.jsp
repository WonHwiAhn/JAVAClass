<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" session="false"%>
    <!-- 이미 session = true가 디폴트로 잡혀있다. -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>로그인</h1>
	<form action="bs" method="post">
		<input type="hidden" value="test" name="test"> 
		ID : <input name="id" placeholder="id를 입력하세요.">
		<br>
		PW : <input type="password" name="pw" placeholder="비밀번호 입력">
		<br> 
		<input type="submit" value="로그인">
	</form>

</body>
</html>