<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove a Cake Record</title>
    </head>
    <body>

    <h1>Remove a Cake record</h1>
    <form id="removeCakeForm" action="RemoveCake" method="post">
    <table>
        <tr><td>ID</td><td><input type="text" id = "ID" name="ID" /></td></tr>
    </table>
    <input type="submit" id="RemoveCake" value="RemoveCake" />
    </form>
    
        <a href="index.jsp"><strong>Home</strong></a><br>
<a href="ListCake"><strong>Look at our menu</strong></a><br>
<a href="CreateCake.jsp"><strong>Create a Cake Record</strong></a><br>
<a href="RemoveCake.jsp"><strong>Delete a Cake</strong></a><br>
</body>
</html>