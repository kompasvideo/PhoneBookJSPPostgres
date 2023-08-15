<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html xmlns:th="http://www.thymeleaf.org" lang="ru">
<head>
    <meta charset="utf-8" lang="ru">
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
    <div class="row m-1 p-1">
        <div class="col-2">
            <form action="viewAddRecord">
                <button type="submit" class="btn btn-block btn-primary">
                    Добавить запись
                </button>
            </form>
        </div>
        <div class="col-10">
            <c:forEach var="phoneBook" items="${phoneBooks}">
            <div class="card card-outline-primary m-1 p-1">
                <div>
                    <form th:method="PA" action="viewRecord"
                          method="post" class="d-inline-flex">
                        <input type="hidden" name="id"
                               value="${phoneBook.phoneBookID}" />
                        <button type="submit"
                                class="btn btn-secondary btn-sm">
                            ${phoneBook.phoneBookID}
                        </button>
                    </form>
                    <div class="d-inline-flex">
                        ${phoneBook.lastName} ${phoneBook.firstName} ${phoneBook.threeName}
                    </div>
                    <form action="deleteRecord"
                          method="post" class="d-inline-flex pull-right" style="float:right">
                        <input type="hidden" name="id"
                               value="${phoneBook.phoneBookID}" />
                        <button type="submit"
                                class="btn btn-danger btn-sm">
                            Удалить
                        </button>
                    </form>
                    <form action="editRecord"
                          method="post" class="d-inline-flex pull-right" style="float:right">
                        <input type="hidden" name="id"
                               value="${phoneBook.phoneBookID}" />
                        <button type="submit"
                                class="btn btn-success btn-sm">
                            Редактировать
                        </button>
                    </form>
                </div>
            </div>
            </c:forEach>
        </div>
    </div>
</div>
<script src="/resources/lib/jquery/dist/jquery.min.js"/>
<script src="/resources/lib/bootstrap/dist/js/bootstrap.bundle.min.js"/>
<script src="/resources/js/site.js"/>
</body>
</html>
