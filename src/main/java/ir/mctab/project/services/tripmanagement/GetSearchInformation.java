package ir.mctab.project.services.tripmanagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetSearchInformation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");
        HttpSession session = request.getSession();
        session.setAttribute("org",origin);
        session.setAttribute("dest",destination);
        out.print("<a href='search'>Search</a>");
    }


}
