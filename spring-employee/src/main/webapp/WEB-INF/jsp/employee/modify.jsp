<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Modify</h1>

<c:set var="ctx" value="<%=request.getContextPath() %>"/>

<form:form action="${ctx }/employee/modify" method="post" commandName="employee">
	<form:hidden path="id"/>
	<form:hidden path="name"/>
	<ul>
		<li>ID : ${employee.id }</li>
		<li>Name : ${employee.name }</li>
		<li>Email : <form:input path="email" />
			<form:errors path="email" /></li>
		<li><input type="submit"></li>
	</ul>
</form:form>