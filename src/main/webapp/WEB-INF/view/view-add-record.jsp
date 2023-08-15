<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta content="text/html" charset="utf-8">
    <title>Java + Spring Framework + Bootstrap</title>
    <link href="/resources/lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/resources/css/site.css" rel="stylesheet" />
</head>
<body>

<!-- Navigation -->
<div class="container">
    <h2 class="text-center alert-secondary">
        Записная книжка
    </h2>
    <div class="row">
        <div class="col-3">&nbsp;</div>
        <div class="card card-outline-primary text-center border-primary col-6 pad">
            <div class="card-header bg-faded bg-primary text-white">
                Добавить запись
            </div>
            <div class="card-body">
                <form:form action="addSaveRecord" method="post" modelAttribute="phoneBook">
                    <form:input type="hidden" path="phoneBookID"
                                value="${phoneBook.phoneBookID}" />
                    Фамилия <form:input path="lastName" class="form-control"/>
                    <br/>
                    Имя <form:input path="firstName" class="form-control"/>
                    <br/>
                    Отчество <form:input path="threeName" class="form-control"/>
                    <br/>
                    Номер телефона <form:input path="numberPhone" class="form-control"/>
                    <br/>
                    Адрес <form:input path="address" class="form-control"/>
                    <br/>
                    Описание <form:input path="description" class="form-control"/>
                    <br/>
                    <input type="submit" class="d-inline-flex btn btn-block btn-primary" value="Добавить запись" />
                </form:form>
            </div>
        </div>
        <div class="col-3">&nbsp;</div>
    </div>
</div>
<script src="/resources/lib/jquery/dist/jquery.min.js"/>
<script src="/resources/lib/bootstrap/dist/js/bootstrap.bundle.min.js"/>
<script src="/resources/js/site.js"/>
</body>
</html>

