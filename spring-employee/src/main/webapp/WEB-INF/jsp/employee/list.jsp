<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Employee List</h1>
<c:if test="${not empty employees}">
<ul>
<c:forEach var="employee" items="${employees }">
	<li>${employee.id }(${employee.name }) <a href="employee/${employee.id }">View</a></li>
</c:forEach>
</ul>
</c:if>

<p>
	<a href="employee/add">Add</a>
</p>
