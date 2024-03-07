<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset=US-ASCII">
	<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
	<table>
        <thead>
            <tr>
               <th>ISBN</th>
               <th>Name</th>
               <th>Author</th>
             </tr>
        </thead>
        <tbody>
                <c:forEach items="${contracts}" var="con">
                    <tr>
                        <td></td>
                        <td>name2</td>
                        <td>book</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>