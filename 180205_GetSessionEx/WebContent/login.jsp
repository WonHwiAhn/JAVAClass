<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" session="false"%>
    <!-- �̹� session = true�� ����Ʈ�� �����ִ�. -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>�α���</h1>
	<form action="bs" method="post">
		<input type="hidden" value="test" name="test"> 
		ID : <input name="id" placeholder="id�� �Է��ϼ���.">
		<br>
		PW : <input type="password" name="pw" placeholder="��й�ȣ �Է�">
		<br> 
		<input type="submit" value="�α���">
	</form>

</body>
</html>