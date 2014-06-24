<%--
  Created by IntelliJ IDEA.
  User: shakhawat.hossain
  Date: 6/23/14
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
<h3>project list by</h3>
<hr>
<table border="1">
    <tr>
        <td> Title</td>
        <td> Description</td>
        <td> Start</td>
        <td> End </td>
    </tr>


    <c:forEach var="project" items="${projectList}">
        <tr>
            <td> <a href="<c:out value="/project/details/${project.getId()}"> </c:out>"> <c:out value="${project.getTitle()}"> </c:out> </a> </td>
            <td><c:out value="${project.getDescription()}"> </c:out></td>
            <td><c:out value="${project.getStartDate()}"> </c:out></td>
            <td><c:out value="${project.getEndDate()}"> </c:out></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>