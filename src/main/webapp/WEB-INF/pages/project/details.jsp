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
<jsp:include page="../fragments/headTag.jsp"/>
<body>
</br> </br> </br> </br>
<div class="container">

    <dl class="dl-horizontal">
        <dt>Title</dt>
        <dd><c:out value="${project.getTitle()}"> </c:out></dd>
    </dl>

    <dl class="dl-horizontal">
        <dt>Description</dt>
        <dd> <c:out value="${project.getDescription()}"> </c:out> </dd>
    </dl>

    <dl class="dl-horizontal">
        <dt> Start Date </dt>
        <dd> <c:out value="${project.getStartDate()}"> </c:out> </dd>
    </dl>


    <dl class="dl-horizontal">
        <dt> End Date </dt>
        <dd> <c:out value="${project.getEndDate()}"> </c:out> </dd>
    </dl>

    <hr>

    <dl class="dl-horizontal">
        <dt>Supervisor(s) </dt>

        <c:forEach var="supervisor" items="${project.getSupervisorList()}" >
        <dd>
            <a href="<c:out value="/supervisor/${supervisor.getId()}"> </c:out>">  <c:out value="${supervisor.getDesignation()} "> </c:out>  <c:out value="${supervisor.getFirstName()} "> </c:out>   <c:out value="${supervisor.getLastName()} "> </c:out> </a>
        </dd>
        </c:forEach>

    </dl>


    <dl class="dl-horizontal">

        <dt>Student(s) </dt>
        <c:forEach var="student" items="${project.getStudentList()}" >
             <dd>
                 <a href="<c:out value="/supervisor/${student.getId()}"> </c:out>">   <c:out value="${student.getFirstName()} "> </c:out> </a> </br>
             </dd>
         </c:forEach>

    </dl>

    </div>

</body>
</html>