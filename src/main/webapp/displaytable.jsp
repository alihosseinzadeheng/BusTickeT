<%@ page import="ir.mctab.project.entities.TripList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="shortcut icon" href="resources/coolshit/bus.JPG" type="image/x-icon" />
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
    <script src="index.js" type="text/javascript"></script>
    <title>نتایج جستجو</title>
</head>
<body>
<div class="table thead-dark" dir="rtl" >
    <div class="container">

        <form action="search" method="post">
            <% if(request.getAttribute("listOfTrips")!=null){%>
            <table id="tripTable" class="table-striped">
                <thead>
                <tr>
                    <th scope="col">شناسه</th>
                    <th scope="col">مبدا</th>
                    <th scope="col">مقصد</th>
                    <th scope="col">تاریخ</th>
                    <th scope="col">کرایه</th>
                    <th scope="col">عملیات</th>
                </tr>

                </thead>
                <tbody id="table-body">

                </tbody>
                <%
                    List<TripList> trips = (List<TripList>) request.getAttribute("listOfTrips");

                    for (TripList travel : trips) {%>
                <tbody>
                <tr>
                    <td id="row-id"><%=travel.getId()%></td>
                    <td><%=travel.getOrigin()%></td>
                    <td><%=travel.getDestination()%></td>
                    <td><%=travel.getDate()%></td>
                    <td><%=travel.getPrice()%></td>
                    <td><button onclick="choose();">انتخاب</button></td>
                </tr>
                </tbody>
                <%
                    }
                %>

            </table>

            <%} else {%>
                   <p>سفر مورد نظر شما یافت نشد</p>
            <%
                }
            %>

        </form>
        <form action="ticket">
            <label>
                <input type="number" name="tripId" placeholder="شماره سفر"/>
                <button type="submit" class="button">تایید</button>
            </label>
        </form>
        <form action="ticket">
            <button type="submit" class="button">جستجوی مجدد</button>
        </form>
    </div>
</div>
</body>
</html>
