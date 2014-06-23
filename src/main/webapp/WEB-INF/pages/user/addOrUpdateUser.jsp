<%--
  Created by IntelliJ IDEA.
  User: shakhawat.hossain
  Date: 6/23/14
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rm" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html lang="en">


<body>
<div class="container">
    <jsp:include page="../fragments/bodyHeader.jsp"/>
    <form:form method="POST" action="/user/add" modelAttribute="user">
        <table>
            <tr>
                <td><form:label path="email">Email</form:label></td>
                <td><form:input path="email" /></td>
                <td><form:errors path="email" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:password path="password" /></td>
                <td><form:errors path="password" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="dateOfBirth">Birthday</form:label></td>
                <td><form:input path="dateOfBirth" /></td>
                <td><form:errors path="dateOfBirth" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="firstName">First Name</form:label></td>
                <td><form:input path="firstName" /></td>
                <td><form:errors path="firstName" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="lastName">Last Name</form:label></td>
                <td><form:input path="lastName" /></td>
                <td><form:errors path="lastName" cssClass="error" /></td>
            </tr>

              <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
<jsp:include page="../fragments/footer.jsp"/>
</body>

</html>
