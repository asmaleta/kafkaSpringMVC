<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>kafka_send</title>
</head>
<body>
<h1>Send a User</h1>
<form action="onsend" method="post">
    <dl>
        <dt>Id:</dt>
        <dd><input type="text" name="id" required></dd>
    </dl>
    <dl>
        <dt>Name:</dt>
        <dd><input type="text" name="name" required></dd>
    </dl>
    <dl>
        <dt>Age:</dt>
        <dd><input type="text" name="age" required></dd>
    </dl>
    <input type="submit" value="Submit">
</form>

<h2><a href="${pageContext.request.contextPath}/welcome">RETURN HOME</a></h2>

</body>
</html>