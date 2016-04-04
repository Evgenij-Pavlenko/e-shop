
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%@ include file="top.jsp" %>

<div class="row">
    <c:forEach items="${goodsList}" var="goods">
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <a href="/product/id/${goods.getId()}">
                    <img src="/resources/img/${goods.getName()+goods.getId()}" alt="${goods.getName()}">

                    <div class="caption">
                        <h3><c:out value="${goods.getName()}"></c:out></h3>

                        <p><c:out value="${goods.getDescription()}"></c:out></p>

                        <p>Цена: <c:out value="${goods.getPrice()}"></c:out></p>

                    </div>
                </a>
            </div>
        </div>
    </c:forEach>
</div>

