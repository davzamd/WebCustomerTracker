<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<main>
    <header>Welcom to the CRM System</header>
    <section id="login">
        <form action="/customer/list" method="get">
            <table>
                <tr>
                    <td>User</td>
                    <td><input type="text" id="user"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" id="password"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="login"></td>
                </tr>
            </table>
        </form>
    </section>
</main>
</body>
</html>
