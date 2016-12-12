<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>GuitarSite</title>

    </head>
    <body>
    <c:forEach items="${users}" var="user">
        <li><c:out value="${user.login}"></c:out></li>
    </c:forEach>

    </body>
</html>