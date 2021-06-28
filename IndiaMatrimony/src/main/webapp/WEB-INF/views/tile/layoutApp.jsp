<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link href="res/css/custom.css" rel="stylesheet">
</head>
<body>

	<div class="header" align="center">
		<tiles:insertAttribute name="header" />
	</div>

	<div style="background: green; width: 100%;">
		<div class="menu" style="float:left;padding:10px;width:10%; opacity: 0.9; border-bottom: 1px; background-repeat: repeat-y"><tiles:insertAttribute name="menu" /></div>    
        <div style="float:left;padding:10px;width:85%;">    
        <tiles:insertAttribute name="body" /></div>   
	</div>
	<div class="footer" align="center">
		<tiles:insertAttribute name="footer" />
	</div>


</body>
</html>
