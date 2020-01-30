
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="rtl">
<head>
    <title>جستجو</title>

    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="bootstrap.min.css"/>
</head>
<body>
<form action="getSearchInfo">

    <h4>با وارد کردن مبدا و مقصد جستجو کنید: </h4>
    مبدا:<input type="text" name="origin" placeholder="origin"/><br/>
    مقصد:<input type="text" name="destination" placeholder="destination"/><br/>
    <button type="submit" class="button">جستجو</button>

</form>

</body>
</html>
