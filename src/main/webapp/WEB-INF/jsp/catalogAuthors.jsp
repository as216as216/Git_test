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
    <h1>Справочник авторов</h1>
    <a href="/">Главная</a><br><br>
    <div>
        <a href="/author/create" class="btn btn-primary">Добавить автора</a>
    </div>
    <br>
    <table>
        <tr>
            <th>ФИО</th>
        </tr>
        <c:forEach var="author" items="${authorsList}">
            <tr>
                <td>${author.name}</td>
                <td><a class="btn btn-warning" href="/author/edit?authorId=${author.id}">Редактировать</a></td>
                <td><a class="btn btn-danger"href="/author/delete?authorId=${author.id}">Удалить</a></td>
            </tr>
        </c:forEach>
    </table>
    </body>
    </html>
</root>