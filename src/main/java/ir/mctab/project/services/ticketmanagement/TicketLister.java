
package ir.mctab.project.services.ticketmanagement;

import ir.mctab.project.entities.Customer;
import ir.mctab.project.entities.Ticket;
import ir.mctab.project.repositories.TicketRepository;
import ir.mctab.project.shared.AuthenticationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TicketLister extends HttpServlet {

    static TicketRepository ticketRepository=TicketRepository.getInstance();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Customer customer=AuthenticationService.getInstance().getLoginCustomer();
        out.println(customer.getId());
        List<Ticket> list=(ticketRepository.SearchFor("customer_id",customer.getId()));

        out.println(list);
        out.close();
    }
}
