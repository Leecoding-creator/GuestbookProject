<!DOCTYPE html>
<html>
	<head><title>방명록</title></head>
	<body>
		<h2>방명록 남기기</h2>
		<form action="guestbook" method="post">
			이름: <input type="text" name="name" required><br>
			메세지 : <input type="text" name="message" required><br>
			<input type="submit" value="등록">
		</form>
		<br>
		<a href="guestbook">방명록 보기</a>
	</body>
</html>