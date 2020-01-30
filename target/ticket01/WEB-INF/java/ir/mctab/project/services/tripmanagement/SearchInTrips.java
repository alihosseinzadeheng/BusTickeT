package ir.mctab.project.services.tripmanagement;

import ir.mctab.project.entities.TripList;
import ir.mctab.project.repositories.TripRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SearchInTrips extends HttpServlet {
    static TripRepository tripRepository=TripRepository.getInstance();
    static String origin;
    static String destination;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        out.println("search . . . \n");
        origin = (String) session.getAttribute("org");
        destination = (String) session.getAttribute("dest");
        List<TripList> list= (tripRepository.SearchFor("origin",origin,"destination",destination));
        for (int i=0; i<list.size(); i++){
            out.println(list.get(i));
        }
        //out.print("<a href='login.jsp'>Login Now</a>");

        request.setAttribute("listOfTrips",list);
        request.getRequestDispatcher("displaytable.jsp").forward(request,response);

        out.close();
    }
}
