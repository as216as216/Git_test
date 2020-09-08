<%--<?xml version="1.0" encoding="UTF-8"?>--%>
<%--<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">--%>

    <%--<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>--%>
    <%--<jsp:output doctype-root-element="html" doctype-system="about:legacy-compat" omit-xml-declaration="true"/>--%>

    <%--<html>--%>
    <%--<head>--%>
        <%--<title>GuestBoot Example</title>--%>
    <%--</head>--%>
    <%--<body>--%>
    <%--<h1>Post new review</h1>--%>
    <%--<form method="POST">--%>
        <%--<label>--%>
            <%--&lt;%&ndash;<textarea name="reviewText" placeholder="Your review here"><jsp:text/></textarea>&ndash;%&gt;--%>
        <%--</label>--%>
        <%--<br/>--%>
        <%--<button type="submit">Submit</button>--%>
    <%--</form>--%>
    <%--<hr/>--%>
    <%--<h1>Reviews</h1>--%>
    <%--&lt;%&ndash;<c:forEach items="${reviews}" var="review">&ndash;%&gt;--%>
        <%--&lt;%&ndash;<div>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<c:out value="${review.reviewText}"/><br/>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<small><c:out value="${review.createDate}"/></small>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</div>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<br/>&ndash;%&gt;--%>
    <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
    <%--</body>--%>
    <%--</html>--%>
<%--</root>--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <body>
    <p>Index JSP</p>
    <%--<p>${requestURI}</p>--%>
    <p> Страница Books3</p>
    <p> ${books}</p>
    <p> ${s1}</p>
    <p> ${books[0].name}</p>


    <c:forEach var="book" items="${books}">
        aaaa.
        <p>${book.name}</p>
        <p>${book}</p>
        <c:out value="${book.name}"/>
    </c:forEach>

    </body>
</html>
</root>