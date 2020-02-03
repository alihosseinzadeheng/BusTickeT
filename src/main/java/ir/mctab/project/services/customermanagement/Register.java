package ir.mctab.project.services.customermanagement;

import ir.mctab.project.entities.Customer;
import ir.mctab.project.repositories.CustomerRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
    static CustomerRepository customerRepository=CustomerRepository.getInstance();
    private static String username;
    private static String password;
    private static String firstname;
    private static String lastname;
    private static String gender;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Welcome babe . . . \n");
        username = request.getParameter("userName");
        out.print("Your username is: "+username+"<br/>");
        password = request.getParameter("passWord");
        out.print("Your password is: "+password+"<br/>");
        firstname = request.getParameter("firstName");
        out.print("Your first name is: "+firstname+"<br/>");
        lastname = request.getParameter("lastName");
        out.print("Your last name is: "+lastname+"<br/>");
        gender = request.getParameter("Gender");
        out.print("Your gender is: "+gender+"<br/>");
        Customer customer = new Customer(username, password, firstname, lastname, gender);
        customerRepository.save(customer);
        out.print("<a href='login.jsp'>Login Now</a>");
        out.close();
    }

}