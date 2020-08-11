<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">


    <title>
        数据 - AdminLTE2定制版 | Log in</title>
</head>

<body >
<jsp:forward page="${pageContext.request.contextPath}/user/toIndedx.do"/>

<div>

    <a href="${pageContext.request.contextPath}/user/queryAllUser.do">queryAllUser</a>
    <a href="${pageContext.request.contextPath}/user/queryAllUser.do">queryAllUser</a>
</div>
    <div>
        <form action="${pageContext.request.contextPath}/user/adddUser" method="post">
            <input name="username" type="text" placeholder="usename"><br>
            <input name="password" type="password" placeholder="password"><br>
            <input name="email" type="email" placeholder="email"><br>
            <input type="submit" value="register">
        </form>



    </div>

</body>

</html>