
<%@ page import="ir.mctab.project.shared.AuthenticationService" %>
<%@ page import="ir.mctab.project.services.tripmanagement.GetSearchInformation" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%--<script type ="text/javascript" src= "javascript.js"></script>--%>
    <title>سامانه خرید بلیط اتوبوس</title><%--<script src="WEB-INF/resources/jquery.min.js"></script>--%>
    <script src="resources/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>

</head>
<body  dir="rtl">

<header class="headOfPage">
    <h4>همراه سفر سامانه برتر خرید بلیط اتوبوس</h4>
</header>
<div class="container">
    <img id="img" src="resources/coolshit/bus.JPG" class="rounded mx-auto d-block image" alt="Responsive image" >

<form action="register.jsp">
    <input type="submit" value="ثبت نام"/>
</form>
<form action="login.jsp">
    <input type="submit" value="ورود"/>
</form>
</div >

<div>
    <%
        if (AuthenticationService.getInstance().getLoginCustomer()!=null){
            new GetSearchInformation();
        }
    %>
</div>

<footer>
<div class="footer">
<blockquote cite="مدیر عامل">
    سفر ایمن را از ما بخواهید.
</blockquote>
    <p><cite>BusTicket</cite> &copy; By <abbr title="علی حسین زاده، نوآموزی در عرصه ی دنیای دیجیتال :-)">Ali </abbr> Agha</p>

</div>
</footer>

</body>
</html>
