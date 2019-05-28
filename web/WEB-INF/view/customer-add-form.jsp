<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 2019-05-28
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Adding Customer</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>

<main>

    <header>
        <h2>CRM - Customer Relationship Manager</h2>
    </header>
    <section id="container">
        <header><h3>Save Customer</h3></header>
        <article id="content">
            <form:form action="saveCustomer" modelAttribute="customer" method="post">

                <form:hidden path="id"/>

                <table>
                    <tbody>
                        <tr>
                            <td><label for="firstName">First Name: </label></td>
                            <td><form:input path="firstName"/></td>
                        </tr>
                        <tr>
                            <td><label for="lastName">Last Name: </label></td>
                            <td><form:input path="lastName"/></td>
                        </tr>
                        <tr>
                            <td><label for="email">Email: </label></td>
                            <td><form:input path="email"/></td>
                        </tr>
                        <tr>
                            <td><label></label></td>
                            <td><input type="submit" value="Save" class="save"/></td>
                        </tr>
                    </tbody>
                </table>
            </form:form>
        </article>
        <article>
            <button onclick="window.location.href='${pageContext.request.contextPath}/customer/list'" class="add-button">Back to list</button>
        </article>
    </section>
</main>
</body>
</html>
