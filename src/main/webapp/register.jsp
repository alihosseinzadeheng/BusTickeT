<%@ page import="ir.mctab.project.services.customermanagement.Register" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="rtl">
<head>
    <meta charset="UTF-8">
    <%--<script type ="text/javascript" src= "javascript.js"></script>--%>
    <title>سامانه خرید بلیط اتوبوس - ثبت نام</title>
    <link rel="stylesheet" href="style.css">
</head>
<body >

<form action="getRegInfo">
    <h4>در اینجا اطلاعات کاربری خود را وارد کنید: </h4>
    نام کاربری مدنظر شما (به زبان انگلیسی):<input type="text" name="userName" placeholder="username"/><br/>
    گذرواژه دلخواه شما (به زبان انگلیسی و اعداد):<input type="text" name="passWord" placeholder="password"/><br/>
    <h4>در اینجا اطلاعات شخصی خود را وارد کنید: </h4>
    نام:<input type="text" name="firstName" placeholder="first name"/><br/>
    نام خانوادگی:<input type="text" name="lastName" placeholder="last name"/><br/>
    جنسیت:<input type="checkbox" name="Gender" value="Male"/> Male
    <input type = "checkbox" name = "Gender" value="Female"/> Female<br/>

    <button type="submit" class="button">تایید</button>
</form>

</body>
</html>
