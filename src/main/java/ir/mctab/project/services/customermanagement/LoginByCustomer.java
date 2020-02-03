package ir.mctab.project.services.customermanagement;

import ir.mctab.project.entities.Customer;
import ir.mctab.project.repositories.CustomerRepository;
import ir.mctab.project.shared.AuthenticationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginByCustomer extends HttpServlet {

    static CustomerRepository customerRepository = CustomerRepository.getInstance();
    static String username;
    static String password;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        username = request.getParameter("userName");
        password = request.getParameter("passWord");
        List<Customer> customersList = null;
        customersList = (customerRepository.SearchFor("username", username, "password", password));
        if (customersList.size() != 0) {
            out.println("با این نام کاربری وارد می شوید:   " + customersList.get(0).getUsername());
            AuthenticationService.getInstance().setLoginCustomer(customersList.get(0));

            out.print("<br><br>");
            out.print("<a href='searchtriplist.jsp'>جستجو در سفرهای موجود</a>");
        } else {
            out.println("<a href='login.jsp'>ابتدا وارد شوید</a>");
            out.close();
        }
    }
}

