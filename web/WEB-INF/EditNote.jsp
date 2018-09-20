<%-- 
    Document   : EditNote
    Created on : Sep 20, 2018, 12:47:19 PM
    Author     : 758243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note - Edit</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h3>Edit Note</h3>
        <form method="post" action="note">
            Title: <input type="text" name="title"><br>
            Contents:<br><textarea cols="27" rows="5" name="contents"></textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
