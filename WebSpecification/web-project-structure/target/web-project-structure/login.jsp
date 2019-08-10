<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<html>
<body>
<h2>login</h2>
${errors }
<form method="post" action="${pageContext.request.contextPath }/loginServlet">
    <table cellpadding="2" cellspacing="2">
        <tr>
            <td>Username</td>
            <td><input type="text" name="username" value="${model.userName }"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password" value="${model.password }"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
</form>




</body>
</html>