
<%@ page import="ir.mctab.project.services.tripmanagement.SearchInTrips" %>
<%@ page import="ir.mctab.project.shared.AuthenticationService" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <link rel="shortcut icon" href="resources/coolshit/bus.JPG" type="image/x-icon" />
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>سامانه خرید بلیط اتوبوس</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
    <script src="resources/js/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("animate").mouseover(function(){
                $("div").animate({
                    left: '100px',
                });
            });
        });
    </script>

</head>
<body  dir="rtl">

<header class="headOfPage">
    <h4>همراه سفر سامانه برتر خرید بلیط اتوبوس</h4>
</header>
<div class="container">
    <animate>
    <img id="img" src="resources/coolshit/bus.JPG" class="rounded d-block image" alt="Responsive image" >
</animate>
    <div class="form-group">
    <form action="register.jsp">
        <button type="submit">ثبت نام</button>
    </form>
    <form action="login.jsp">
        <button type="submit">ورود</button>
    </form>
    </div>
</div >

<div>
    <%
        if (AuthenticationService.getInstance().getLoginCustomer()!=null){
            new SearchInTrips();
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
