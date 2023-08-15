<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
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
    <div class="card card-outline-primary m-1 p-1">
        <div class="bg-faded p-1">
            <h5>
                ${phoneBook.lastName} ${phoneBook.firstName}  ${phoneBook.threeName}
            </h5>
            <div>
                ${phoneBook.description}
            </div>
            <div>
                ${phoneBook.numberPhone}
            </div>
            <div>
                ${phoneBook.address}
            </div>
        </div>
    </div>
</div>
<script src="/resources/lib/jquery/dist/jquery.min.js"/>
<script src="/resources/lib/bootstrap/dist/js/bootstrap.bundle.min.js"/>
<script src="/resources/js/site.js"/>
</body>
</html>
