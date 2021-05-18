<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1" import="java.io.*" import="java.sql.*" %>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Welcome <%=session.getAttribute("name")%></title>  
<link href="style_2.css" rel="stylesheet" type="text/css"/>
</head>  
<body>  
    <h3 id="title">   
        Welcome
        <%=session.getAttribute("name")%> </h3>
              

<br> </br>
<form action="CreateAuction.jsp" method="get">
                   <input type="submit" id="login-box" value="Create Auction" />
                   </form> 
<form action="UpdateAccount.jsp" method="get">
                   <input type="submit" id="login-box" value="Update Account Details" />
                   </form>  
      <form action="MyAuctions" method="get">
                   <input type="submit" id="login-box" value="My Auction" />
                   </form>      
        
</body>  
</html>