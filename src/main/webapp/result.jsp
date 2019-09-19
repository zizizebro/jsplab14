
<%@ page import="java.util.List" %>
<%@ page isELIgnored="false" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
        <%
        List styles = (List)request.getAttribute("styles");
         %>
        <c:forEach var ="beer" items= "${styles}">
           <p align="center" style="font-size: 20px"><%= "try: "%>  ${beer}</p>
        </c:forEach>

</body>
</html>