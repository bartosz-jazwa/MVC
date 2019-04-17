<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

<form:form action="/zatwierdz" method="post" modelAttribute="user">
    <form:label path="imie">Imie</form:label>
    <form:input path="imie"/> <br>
    <form:label path="id">ID</form:label>
    <form:input path="id"/> <br>
    <form:label path="nrTelefonu">Numer telefonu</form:label>
    <form:input path="nrTelefonu"/><br>
    <input type="submit" value="Zatwierdz formularz"/>
</form:form>

</body>
</html>