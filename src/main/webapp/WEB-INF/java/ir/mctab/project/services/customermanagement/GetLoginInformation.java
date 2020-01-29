package ir.mctab.project.services.customermanagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetLoginInformation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("userName");
        out.print("Your username is: "+username+"<br/>");
        String password = request.getParameter("passWord");
        HttpSession session = request.getSession();
        session.setAttribute("uname",username);
        session.setAttribute("pass",password);
        out.print("<a href='login'>Login</a>");
    }


}
