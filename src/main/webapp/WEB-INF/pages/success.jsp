<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>username!</h2>
${sessionUser.id}
${sessionUser.username}
<br>
<table border="1" >
    <tr>
        <th>count</th>
        <th>username</th>
        <th>email</th>
    </tr>
    <c:forEach items="${userList}" var="user" varStatus="vs">
        <tr>
            <th>${vs.count}</th>
            <th>${user.username}</th>
            <th>${user.email}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
