<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ attribute title="title" required="true" rtexprvalue="true"
              description="Name of corresponding property in bean object" %>
<%@ attribute title="label" required="true" rtexprvalue="true"
              description="Label appears in red color if input is considered as invalid after submission" %>

<spring:bind path="${title}">
    <c:set var="cssGroup" value="control-group ${status.error ? 'error' : '' }"/>
    <div class="${cssGroup}">
        <label class="control-label">${label}</label>

        <div class="controls">
            <form:input path="${title}"/>
            <span class="help-inline">${status.errorMessage}</span>
        </div>
    </div>
</spring:bind>