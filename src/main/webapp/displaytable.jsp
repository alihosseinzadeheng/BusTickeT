<%@ page import="ir.mctab.project.entities.TripList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="WEB-INF/resources/css/style.css">
    <link rel="stylesheet" href="bootstrap.min.css">

    <title>نتایج جستجو</title>
</head>
<body>
<div class="table thead-dark" dir="rtl" >
    <div class="container">

        <form action="search" method="post">

            <% if(request.getAttribute("listOfTrips")!=null){%>
            <table class="table-striped">
                <thead>
                <tr>
                    <th scope="col">شناسه</th>
                    <th scope="col">مبدا</th>
                    <th scope="col">مقصد</th>
                    <th scope="col">تاریخ</th>
                    <th scope="col">کرایه</th>
                </tr>

                </thead>

                <%
                    List<TripList> trips = (List<TripList>) request.getAttribute("listOfTrips");

                    for (TripList travel : trips) {%>
                <tbody>
                <tr>
                    <td><%=travel.getId()%></td>
                    <td><%=travel.getOrigin()%></td>
                    <td><%=travel.getDestination()%></td>
                    <td><%=travel.getDate()%></td>
                    <td><%=travel.getPrice()%></td>
                </tr>
                </tbody>
                <%
                    }
                %>

            </table>
            <%
                }
            %>

        </form>

    </div>
</div>
</body>
</html>
