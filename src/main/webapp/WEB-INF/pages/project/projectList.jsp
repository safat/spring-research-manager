<%--
  Created by IntelliJ IDEA.
  User: shakhawat.hossain
  Date: 6/23/14
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>

<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>

<div class="container">

<h3><c:out value="${title}"> </c:out></h3>
<hr>
        <%--<table theme="bootstrap2" class="table table-striped">--%>
            <%--<tr>--%>
                <%--<td> Title</td>--%>
                <%--<td> Description</td>--%>
                <%--<td> Start</td>--%>
                <%--<td> End </td>--%>
            <%--</tr>--%>


            <%--<c:forEach var="project" items="${projectList}">--%>
                <%--<tr>--%>
                    <%--<td> <a href="<c:out value="/project/details/${project.getId()}"> </c:out>"> <c:out value="${project.getTitle()}"> </c:out> </a> </td>--%>
                    <%--<td><c:out value="${project.getDescription()}"> </c:out></td>--%>
                    <%--<td><c:out value="${project.getStartDate()}"> </c:out></td>--%>
                    <%--<td><c:out value="${project.getEndDate()}"> </c:out></td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>

        <%--</table>--%>


    <datatables:table id="project" data="${projectList}" pageable="false"  row="project" theme="bootstrap2" cssClass="table">

        <datatables:column title="Title">
            <a href="<c:out value="/project/details/${project.getId()}"> </c:out>"> <c:out value="${project.getTitle()}"> </c:out> </a>
        </datatables:column>

        <datatables:column title="Description">
            <c:out value="${project.getDescription()}"></c:out>
        </datatables:column>

        <datatables:column title="Description">
            <c:out value="${project.getDescription()}"></c:out>
        </datatables:column>

        <datatables:column title="Start">
            <c:out value="${project.getStartDate()}"></c:out>
        </datatables:column>


        <datatables:column title="End">
            <c:out value="${project.getEndDate()}"></c:out>
        </datatables:column>

    </datatables:table>


   </div>
</body>
</html>