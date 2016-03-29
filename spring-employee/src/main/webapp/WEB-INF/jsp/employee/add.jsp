<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Add</h1>
<form:form action="add" method="post" commandName="employee">
	<ul>
		<li>ID* : <form:input path="id" />
			<form:errors path="id" />
		</li>
		<li>Name* : <form:input path="name" />
			<form:errors path="name" /></li>
		<li>Email : <form:input path="email" />
			<form:errors path="email" /></li>
		<li><input type="submit"></li>
	</ul>
</form:form>