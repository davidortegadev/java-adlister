<%--
  Created by IntelliJ IDEA.
  User: dad
  Date: 3/2/20
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>

    <h1>Here are all the Ads:</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h3>User: ${ad.user}</h3>
            <h2>Title: ${ad.title}</h2>
            <h4>Description: ${ad.description}</h4>

        </div>
    </c:forEach>
</body>
</html>
