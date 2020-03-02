<%--
  Created by IntelliJ IDEA.
  User: dad
  Date: 2/27/20
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/login.jsp" method="post">
        <label for="username">Username</label>
        <input type="text" name="username" id="username">
        <label for="password">Password</label>
        <input type="password" name="password" id="password">
        <button>Log In</button>
    </form>

    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && username.equals("admin") &&
                password !=null && password.equals("pass"))
            response.sendRedirect("/profile.jsp");
    %>

</body>
</html>
