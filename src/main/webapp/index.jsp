<%@ page import="ir.mctab.project.shared.AuthenticationService" %>
<%@ page import="ir.mctab.project.services.tripmanagement.GetSearchInformation" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <%--<script type ="text/javascript" src= "javascript.js"></script>--%>
    <title>سامانه خرید بلیط اتوبوس</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
<body >
<h2 class="headOfPage">
    خوش آمدید
</h2>

    <div class="content">
        <img src="bus.JPG" class="rounded mx-auto d-block" alt="Responsive image">
        <form action="register.jsp" class="button">
            <input type="submit" value="ثبت نام"/>
        </form>
        <form action="login.jsp" class="button">
            <input type="submit" value="ورود"/>
        </form>
    </div>
<div>
<%
if (AuthenticationService.getInstance().getLoginCustomer()!=null){
    new GetSearchInformation();
}
%>
</div>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</body>
</html>
