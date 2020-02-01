package ir.mctab.project.services.customermanagement;

import ir.mctab.project.entities.Customer;
import ir.mctab.project.repositories.CustomerRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
    static CustomerRepository customerRepository=CustomerRepository.getInstance();
    private static String username;
    private static String password;
    private static String fisrtname;
    private static String lastname;
    private static String gender;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        out.println("Welcome babe . . . \n");
        username = (String) session.getAttribute("uname");
        password = (String) session.getAttribute("pass");
        fisrtname = (String) session.getAttribute("fname");
        lastname = (String) session.getAttribute("lname");
        gender = (String) session.getAttribute("gen");
        Customer customer = new Customer(username, password, fisrtname, lastname, gender);
        customerRepository.save(customer);
        out.print("<a href='login.jsp'>Login Now</a>");
        out.close();
    }

}