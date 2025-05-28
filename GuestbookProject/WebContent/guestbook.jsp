<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<html>
<head><title>방명록 보기</title></head>
<body>
    <h2>등록된 메시지</h2>
    <ul>
        <%
            List<String> messages = (List<String>) request.getAttribute("messages");
            for (String msg : messages) {
        %>
            <li><%= msg %></li>
        <% } %>
    </ul>
    <br>
    <a href="index.jsp">뒤로가기</a>
</body>
</html>
