<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%@ include file="top.jsp" %>
<%--start of body page--%>

<p><a class="btn btn btn-primary" href="/product/add" role="button">Добавить продукт</a></p>

<form id="update" action=""></form>
<table class="table table-hover">
    <tbody>
    <tr>
        <th>ID</th>
        <th>Артикул</th>
        <th>Имя</th>
        <th>Цена</th>
        <th>Количество</th>
        <th></th>
    </tr>
    <c:forEach items="${goodsList}" var="goods">
        <tr>
            <td><c:out value="${goods.getId()}"></c:out></td>
            <td><c:out value="${goods.getGoodsCode()}"></c:out></td>
            <td><c:out value="${goods.getName()}"></c:out></td>
            <td><c:out value="${goods.getPrice()}"></c:out></td>
            <td><c:out value="${goods.getNumber}"></c:out></td>
            <td>
                <form method="get">
                    <button class="btn btn-primary" formaction="/goods/update/${goods.getId()}">
                        Изменить
                    </button>
                    <button class="btn btn-danger" formaction="/goods/delete/${goods.getId()}">
                        Удалить
                    </button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
