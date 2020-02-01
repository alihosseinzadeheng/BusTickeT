package ir.mctab.project.services.customermanagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class GetRegistrationInformation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("userName");
        out.print("Your username is: "+username+"<br/>");
        String password = request.getParameter("passWord");
        out.print("Your password is: "+password+"<br/>");
        String firstname = request.getParameter("firstName");
        out.print("Your first name is: "+firstname+"<br/>");
        String lastname = request.getParameter("lastName");
        out.print("Your last name is: "+lastname+"<br/>");
        String gender = request.getParameter("Gender");
        out.print("Your gender is: "+gender+"<br/>");
        HttpSession session = request.getSession();
        session.setAttribute("uname",username);
        session.setAttribute("pass",password);
        session.setAttribute("fname",firstname);
        session.setAttribute("lname",lastname);
        session.setAttribute("gen",gender);
        out.print("<br/> If you confirm, click on below: <br/>");
        out.print("<a href='reg'>Save it Now</a>");
    }

}
