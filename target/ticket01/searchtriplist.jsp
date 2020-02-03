<%@ page import="ir.mctab.project.shared.AuthenticationService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="rtl">
<head>
    <link rel="shortcut icon" href="resources/coolshit/bus.JPG" type="image/x-icon" />
    <title>جستجو</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
</head>

<body>
<%if (AuthenticationService.getInstance().getLoginCustomer()!=null){
%>
<form action="search">
    <div class="form-group">


    <header>با وارد کردن مبدا و مقصد جستجو کنید: </header>
    مبدا:<input type="text" name="origin" placeholder="مبدا"/><br/>
    مقصد:<input type="text" name="destination" placeholder="مقصد"/><br/>
    <button type="submit" class="button">جستجو</button>
    </div>
</form>

<%
    } else{
%>
<p>شما وارد نشده اید</p>
<%
    }
%>
</body>
</html>
