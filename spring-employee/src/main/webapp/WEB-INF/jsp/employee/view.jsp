<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>View</h1>
<ul>
	<li>ID : ${employee.id }
	<li>Name : ${employee.name }
	<li>Email : ${employee.email }
</ul>
<p>
	<a href="${employee.id }/modify">Modify</a><br /> 
	<a href="${employee.id }/delete">Delete</a><br /> 
	<a href="../employees">List</a>
</p>