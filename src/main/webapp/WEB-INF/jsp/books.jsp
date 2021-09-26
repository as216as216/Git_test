<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <body>
    <h1> Страница Книги3</h1>
    <c:forEach var="book" items="${books}">
        <div>
            <a href="/books/authors?bookId=${book.id}">${book.name}</a>
        </div>
    </c:forEach>

    </body>
    </html>
</root>