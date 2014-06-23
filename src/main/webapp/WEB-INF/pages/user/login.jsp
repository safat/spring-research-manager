<%--
  Created by IntelliJ IDEA.
  User: shakhawat.hossain
  Date: 6/23/14
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page session="false" %>

<html>
<head>
    <title>login</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<form:form action="/login" modelAttribute="user">
<div id="login">
    <table>

        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id"></form:input></td>
        </tr>

        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:password path="password" /></td>
        </tr>
        <tr>
            <td>
                 <input type="submit" id="loginButton" value="Login">
            </td>

        </tr>
        <tr>
            <td>
                <c:if test="${message != null}">
                    <p class="login_failed"><c:out value="${message}"/> &nbsp</p>
                </c:if>
            </td>
        </tr>
    </table>
</div>

</form:form>

</body>
</html>