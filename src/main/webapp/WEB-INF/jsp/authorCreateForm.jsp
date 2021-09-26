<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <%--Bootstrap--%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <body>
    <h1>Добавление автора</h1>
    <a href="/">Главная</a>
    <a href="/authors">Справочник авторов</a>
    <br>
    <br>
    <form action="/author/create" method="post">
        <div class="row">
            <div class="col-md-1">
                <label for="authorName">ФИО</label>
            </div>
            <div class="col-md-1">
                <input type="text" name="authorName" id="authorName"/>
            </div>
        </div>
        <div>
            <input type="submit" value="Добавить" class="btn btn-success">
        </div>
    </form>
    </body>
    </html>
</root>