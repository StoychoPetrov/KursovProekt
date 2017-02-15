<%@ page import="main.Main" %><%--
  Created by IntelliJ IDEA.
  User: stoycho.petrov
  Date: 14/02/2017
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <form method="post" action="numberN">
      Input N:<input type="number" name="n">
    </form>

    <h3 class="message"><%=Main.getMessage()%></h3>
  </body>
</html>
