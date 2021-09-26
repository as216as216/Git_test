<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <body>
    <h1> Главная страница</h1>
    Версия 0.1 <br>
    ${model.version}

    <br>
    <a href="/books">Каталог книг</a>
    <br>
    <a href="/authors">Справочник авторов</a>


    </body>
    </html>
</root>