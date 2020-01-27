package ir.mctab.project.services.customermanagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {

    public class register {


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n = request.getParameter("userName");
        out.print(n);
        HttpSession session = request.getSession();
        session.setAttribute("uname",n);
        out.print("<a href='servlet2'>Save</a>");
    }



}
