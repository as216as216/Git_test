<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<body>
<h1>Справочник книг</h1>
<br>
<div>
    <a href="/book/create">Добавить книгу</a>
</div>
<br>
<table>
    <tr>
        <th>Наименование</th>
        <td>Действие</td>
    </tr>
    <#list books as book>
        <tr>
            <td><a href="/books/authors?bookId=${book.id}">${book.name}</a></td>
            <td><a href="/books/delete?bookId=${book.id}">Удалить</a></td>
        </tr>
    </#list>

</table>
</body>
</html>