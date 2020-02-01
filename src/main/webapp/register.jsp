<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <%--<script type ="text/javascript" src= "javascript.js"></script>--%>
    <title>ثبت نام</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
</head>
<body >

<form action="getRegInfo" dir="rtl">
<div class="form-group"> 
    <header>در اینجا اطلاعات کاربری خود را وارد کنید: </header><br>
    نام کاربری مدنظر شما (به زبان انگلیسی):<input type="text" name="userName" placeholder="نام کاربری"/><br/>
    گذرواژه دلخواه شما (به زبان انگلیسی و اعداد):<input type="text" name="passWord" placeholder="گذرواژه"/><br/>
    <header>در اینجا اطلاعات شخصی خود را وارد کنید: </header>
	<br> 
	
    نام:<input type="text" name="firstName" placeholder="نام"/><br/>
    نام خانوادگی:<input type="text" name="lastName" placeholder="نام خانوادگی"/><br/>
    <div class="select-container" >
	جنسیت: 
        <select class="select" name="جنسیت">
            <option>خانم</option>
            <option>آقا</option>
            <option>خاص</option>
        </select>
    </div>
	</enter-value>
	<br><br>
    <button type="submit" class="button">تایید</button>
	</div>
</form>

</body>
</html>
