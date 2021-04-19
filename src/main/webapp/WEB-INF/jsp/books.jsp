<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h1>Справочник книг</h1>
    <br>
    <div>
        <a href="/">Главная</a><br><br>
        <a href="/book/create" class="btn btn-primary">Добавить книгу</a>
    </div>
    <br>
    <table>
        <tr>
            <th>Наименование</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td><a href="/books/authors?bookId=${book.id}">${book.name}</a></td>
                <td><a class="btn btn-warning" href="/books/edit?bookId=${book.id}">Редактировать</a></td>
                <td><a class="btn btn-danger"href="/books/delete?bookId=${book.id}">Удалить</a></td>
            </tr>
        </c:forEach>
    </table>
    </body>
    </html>
</root>