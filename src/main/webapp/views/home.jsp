<!--

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
	<h3>Hi vivek</h3><br>
	<strong>Current Time is</strong>: <%=new Date() %>
</body>
</html>
-->
<%@ page language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset=US-ASCII>
	<title>Contract</title>
</head>
<body>
	<table>
        <thead>
            <tr>
               <th>ID</th>
               <th>External ID</th>
               <th>Requirement type</th>
               <th>Object text</th>
               <th>Requirement title</th>
               <th>Requirement rational</th>
               <th>Cust comment</th>
               <th>Requirement forwarding</th>
               <th>Requirement varification</th>
             </tr>
        </thead>
        	<tbody>
                <c:forEach items="${contract}" var="con">
                    <div>
						<tr>
							<td>ID= ${con.id}</td>
							<td><c:out value="${con.external_id}"/></td>
							<td><c:out value="${con.req_type}"/></td>
							<td><c:out value="${con.obj_text}"/></td>
							<td><c:out value="${con.req_title}"/></td>
							<td><c:out value="${con.req_rational}"/></td>
							<td><c:out value="${con.cust_comments}"/></td>
							<td><c:out value="${con.req_forwarding}"/></td>
							<td><c:out value="${con.req_varification}"/></td>
						</tr>
					</div>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>
