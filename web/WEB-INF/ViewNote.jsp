<%-- 
    Document   : ViewNote
    Created on : Sep 20, 2018, 12:47:10 PM
    Author     : 758243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note - View</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h3>View Note</h3>
        <b>Title: </b>${note.title}<br><br>
        <b>Contents:</b><br>
        ${note.contents}<br><br>
        <a href="note?edit">Edit</a>
    </body>
</html>
