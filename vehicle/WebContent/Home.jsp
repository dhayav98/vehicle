<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="loginstyle.css">
<script>
var req;

function A()
{
	var url="Createvehicle.jsp";
	if(window.XMLHttpRequest) req=new XMLHttpRequest();
	else if(window.ActiveXObject) req=new ActiveXObject("Microsoft.XMLHTTP");
	try
	{
		req.onreadystatechange=function()
		{
			if(req.readyState==4)
		{
			var val=req.responseText;
			document.getElementById("id1").innerHTML=val;
		}
	}
	req.open("GET",url,true);
	req.send();
	}
	catch(e)
	{	
		alert("Unable to connect Server");
	}
}

function B()
{
	var url="Displayvehicle";
	if(window.XMLHttpRequest) req=new XMLHttpRequest();
	else if(window.ActiveXObject) req=new ActiveXObject("Microsoft.XMLHTTP");
	try
	{
		req.onreadystatechange=function()
		{
			if(req.readyState==4)
		{
			var val=req.responseText;
			document.getElementById("id1").innerHTML=val;
		}
	}
	req.open("GET",url,true);
	req.send();
	}
	catch(e) 
	{	
		alert("Unable to connect Server");
	}
}
</script>
</head>
<body class="bodystyle">
<div class="bodystyle1">
<h1 style="text-align:center; "></h1>
<br>
<form action="Createvehicle.jsp" method="post">
<input type="button" class="loginbutton" onclick="A()" value="Create vehicle"  /><br>
</form>
<form action="Displayvehicle" method="post">
<input type="button" class="loginbutton" onclick="B()" value="Update vehicle"  /><br>
</form>
<span id="id1"></span>
</body>
</html>