<%--
  Created by IntelliJ IDEA.
  User: shakhawat.hossain
  Date: 6/24/14
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
<h4> Title : <c:out value="${project.getTitle()}"> </c:out> </h4>
<div>
    <h6> Description </h6>
 <p>
     <c:out value="${project.getDescription()}"> </c:out>
 </p>
</div>

<div>
    <h6> Start Date </h6>
    <p>
        <c:out value="${project.getStartDate()}"> </c:out>
    </p>
    <h6> End Date </h6>
    <p>
        <c:out value="${project.getEndDate()}"> </c:out>
    </p>
</div>


<hr>
<h5> Supervisors  </h5>
 <c:forEach var="supervisor" items="${project.getSupervisorList()}" >
 <a href="<c:out value="/supervisor/${supervisor.getId()}"> </c:out>">  <c:out value="${supervisor.getFirstName()} "> </c:out> </a> </br>
 </c:forEach>

<hr>
<h5> Students  </h5>
<c:forEach var="student" items="${project.getStudentSet()}" >
    <a href="<c:out value="/supervisor/${student.getId()}"> </c:out>">  <c:out value="${student.getFirstName()} "> </c:out> </a> </br>
</c:forEach>


</body>
</html>