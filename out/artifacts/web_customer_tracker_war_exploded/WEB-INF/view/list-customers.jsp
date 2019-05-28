<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 2019-05-27
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="i" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<main>
    <header>
        <h2>CRM - Customer Relationship Manager</h2>
    </header>
    <section id="container">

        <article id="content">
            <section>
                <button onclick="window.location.href='showFromForAdd'" class="add-button">Add Customer</button>
            </section>
            <section>
                <table id="list">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Action</th>
                    </tr>

                    <i:forEach var="customer" items="${customers}">
                        <i:url var="updateLink" value="/customer/showFromForUpdate">
                            <i:param name="customerId" value="${customer.id}"/>
                        </i:url>

                        <i:url var="deleteLink" value="/customer/delete">
                            <i:param name="customerId" value="${customer.id}"/>
                        </i:url>
                        <tr>
                            <td>${customer.firstName}</td>
                            <td>${customer.lastName}</td>
                            <td>${customer.email}</td>
                            <td><button onclick="window.location.href='${updateLink}'">Update</button>
                                <button onclick="if(!(confirm('Are you sure?'))) return false; else (window.location.href='${deleteLink}')">Delete</button></td>
                        </tr>
                    </i:forEach>
                </table>
            </section>
        </article>
    </section>
</main>
</body>
</html>
