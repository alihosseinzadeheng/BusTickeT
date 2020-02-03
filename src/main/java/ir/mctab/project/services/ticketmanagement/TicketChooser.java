package ir.mctab.project.services.ticketmanagement;

import ir.mctab.project.entities.Ticket;
import ir.mctab.project.entities.TripList;
import ir.mctab.project.repositories.TicketRepository;
import ir.mctab.project.repositories.TripRepository;
import ir.mctab.project.shared.AuthenticationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

public class TicketChooser extends HttpServlet {
    int stationFee=5000;
    static TripRepository tripRepository=TripRepository.getInstance();
    static TicketRepository ticketRepository=TicketRepository.getInstance();
    static Long tripId;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        tripId = Long.parseLong(request.getParameter("tripId"));

        List<TripList> list=(tripRepository.SearchFor("id",tripId));

        LocalDate localDate = LocalDate.now();

        Ticket ticket=new Ticket(
                list.get(0).getId(),
                AuthenticationService.getInstance().getLoginCustomer(),
                list.get(0).getOrigin(),
                list.get(0).getDestination(),
                list.get(0).getPrice()+stationFee,
                localDate
        );

        //TODO you have to connect it to the lister
        //new TicketLister();
        out.println(ticket);
        ticketRepository.save(ticket);

        out.close();
    }
}
