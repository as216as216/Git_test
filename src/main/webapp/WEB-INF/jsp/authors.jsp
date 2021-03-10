<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <body>
    <h1> Страница Авторы</h1>
    <a href="/">Главная</a>
    <div>
        <b>${curBook.name}</b>
        <br>
        <br>
    </div>
    <c:forEach items="${curBook.bookAuthors}" var="author">
        <div>
            <li>${author.name}</li>
        </div>
    </c:forEach>
    </body>
    </html>
</root>