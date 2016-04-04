<%@ page import="oa.pavlenko.model.Role" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%--<%    pageContext.setAttribute("role", Role.class.getEnumConstants()); %>--%>
<%--<%    pageContext.setAttribute("monEnum", Role.ListTypeAffichage.values()); %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Добавление пользователя</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>

<form role="form" action="/adduser" method="POST">
    <div class="col-sm-10">
        <div class="form-group">
            <label for="name">Введите имя пользователя:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Имя">
        </div>

        <div class="form-group">
            <label for="last-name">Введите фамилию пользователя:</label>
            <input type="text" class="form-control" id="last-name" name="last-name" placeholder="Фамилия">
        </div>

        <div class="form-group">

            <label for="age">Введите возраст пользователя:</label>


            <input type="number" class="form-control" id="age" name="age" placeholder="Возраст" min="16" max="100"
                   step="1">

        </div>

        <div class="form-group">
            <label for="adress">Введите адрес доставки:</label>
            <input type="text" class="form-control" id="adress" name="adress" placeholder="Адрес доставки">
        </div>

        <div class="form-group">
            <label for="email">Введите email пользователя:</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="email@web.com">
        </div>

        <div class="form-group">
            <label for="password">Введите пароль пользователя:</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="Пароль">
        </div>

        <%--Будет видно только для админа--%>
        <%--Получилось сделать список ролей автоматом--%>
        <div class="form-group">
            <label for="role">Введите роль пользователя:</label>
            <c:set var="role" value="<%=Role.values()%>"/>
            <select class="form-control" id="role" name="role">
                <c:forEach var="roleEnum" items="${role}">
                    <option selected value="${roleEnum.name()}">${roleEnum.name()}</option>
                </c:forEach>
            </select>
        </div>


        <button type="submit" class="btn btn-success" value="Добавить"/>
    </div>
</form>


</body>
</html>
