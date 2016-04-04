<%--<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <%--Что-то не работает с папки ресурсы--%>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/js/bootstrap.min.js" rel="script">
    <script src="http://code.jquery.com/jquery-2.2.2.js"></script>
    <%--Padding for NavBar--%>
    <title>Заголовок</title>
</head>
<body>
<header class="header">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <!-- Название компании и кнопка, которая отображается для мобильных устройств группируются для лучшего отображения при свертывание -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">E-SHOP</a>
            </div>

            <!-- Группируем ссылки, формы, выпадающее меню и прочие элементы -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/goods">Товары</a></li>
                    <%--Сделать видимым только для админа--%>
                    <li class="active"><a href="/users">Пользователи</a></li>
                    <%--<li><a href="#">Link</a></li>--%>
                    <%--<li class="dropdown">--%>
                    <%--<a href="#" class="dropdown-toggle, active" data-toggle="dropdown">Dropdown <b--%>
                    <%--class="caret"></b></a>--%>
                    <%--<ul class="dropdown-menu">--%>
                    <%----%>
                    <%--<li><a href="#">Action</a></li>--%>
                    <%--<li><a href="#">Another action</a></li>--%>
                    <%--<li><a href="#">Something else here</a></li>--%>
                    <%--<li class="divider"></li>--%>
                    <%--<li><a href="#">Separated link</a></li>--%>
                    <%--<li class="divider"></li>--%>
                    <%--<li><a href="#">One more separated link</a></li>--%>
                    <%--</ul>--%>
                    <%--</li>--%>
                </ul>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Поиск">
                    </div>
                    <button type="submit" class="btn btn-default">Искать</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <%--Не заработал выпадающий список(( все, что мог подключил--%>
                    <li class="dropdown">
                    <li class="active">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Управление <b class="caret"></b></a>
                    </li>
                    <ul class="dropdown-menu">
                        <li><a href="/goods">Товары</a></li>
                        <li><a href="/cat">Категории</a></li>
                        <li><a href="/users">Пользователи</a></li>
                        <li><a href="/orders">Заказы</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                    </li>
                    <li><a href="/login">Вход</a></li>
                    <li><a href="/addUser">Регистрация</a></li>
                    <li><a href="/cart">Корзина</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</header>

