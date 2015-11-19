<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Cake Record</title>
    </head>
    <body>

    <h1>Create a Cake record</h1>
    <form id="createCakeForm" action="CreateCake" method="post">
    <table>
        <tr><td>ID</td><td><input type="text" id = "ID" name="ID" /></td></tr>
        <tr><td>Cake:</td><td><input type="text" id = "cakeName" name="CakeName" /></td></tr>
        <tr><td>Ingredients</td><td><input type="text" id = "ingredients" name="Ingredients" /></td></tr>
        <tr><td>Stock</td><td><input type="number" id = "stock" name="Stock" /></td></tr>
    </table>
    <input type="submit" id="CreateCake" value="CreateCake" />
    </form>

<a href="index.jsp"><strong>Home</strong></a>
<a href="ListCake"><strong>Look at our menu</strong></a>
<a href="CreateCake.jsp"><strong>Create a Cake Record</strong></a>
<a href="RemoveCake.jsp"><strong>Delete a Cake</strong></a>
</body>
</html>
