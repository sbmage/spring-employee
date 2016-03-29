<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html
	xmlns="http://www.w3.org/1999/xhtml"
	xml:lang="ko" lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>
	<!--<tiles:getAsString name="title"/>-->
</title>
</head>
<body>
	<div id="Wrapper">
		<div id="head">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="userTitle">
			<tiles:insertAttribute name="title" />
		</div>
		<div id="container">
			<div class="content">
				<tiles:insertAttribute name="body" />
			</div>
			<div class="sidebar">
				<tiles:insertAttribute name="rightMenu" />
			</div>
		</div>
		<div id="tail">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>