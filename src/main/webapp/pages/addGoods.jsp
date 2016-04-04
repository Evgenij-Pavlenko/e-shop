<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%@ include file="top.jsp" %>
<%--start of body page--%>
<h1>Новый продукт</h1>
<form class="form" action="/goods/addForm" method="post">
    <div class="form-group">
        <label for="code" class="col-sm-2 control-label">Code</label>

        <div class="col-sm-10">
            <input type="text" class="form-control" id="code" name="code" placeholder="Артикул" required>
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Название товара</label>

        <div class="col-sm-10">
            <input type="text" class="form-control" id="name" name="name" placeholder="Название товара" required>
        </div>
    </div>
    <div class="form-group">
        <label for="description" class="col-sm-2 control-label">Описание</label>

        <div class="col-sm-10">
            <textarea class="form-control" rows="3" id="description" name="description"
                      placeholder="Описание"></textarea>
            <%--<input type="text" class="form-control" id="description" name="description" placeholder="Description">--%>
        </div>
    </div>
    <div class="form-group">
        <label for="exampleInputFile" class="col-sm-2 control-label">Фото товара</label>

        <div class="col-sm-10">
            <input type="file" id="exampleInputFile">

            <p class="help-block">Загрузите изображение</p>
        </div>
    </div>


    <div class="form-group">
        <label for="price" class="col-sm-2 control-label">Цена</label>

        <div class="col-sm-10">
            <input type="number" min="0" class="form-control" id="price" name="price" placeholder="Цена" required>
        </div>
    </div>
    <div class="form-group">
        <label for="number" class="col-sm-2 control-label">Количество</label>

        <div class="col-sm-10">
            <input type="number" min="0" max="50" step="1" class="form-control" id="number" name="number" required>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input type="submit" class="btn btn-primary" value="Добавить">
        </div>
    </div>
</form>

