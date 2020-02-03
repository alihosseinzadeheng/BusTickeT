package ir.mctab.project.services.tripmanagement;

import ir.mctab.project.entities.TripList;
import ir.mctab.project.repositories.TripRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        origin = request.getParameter("origin");
        destination = request.getParameter("destination");
        List<TripList> list=null;
        if (origin!="" && destination!="") {
            list = (tripRepository.SearchFor("origin", origin, "destination", destination));
        } else if (destination==""){
            list=(tripRepository.SearchFor("origin",origin));
        } else {
            list=(tripRepository.SearchFor("destination",destination ));
        }

       if (list.size()==0) {
            list=null;
        }
        request.setAttribute("listOfTrips", list);
        request.getRequestDispatcher("displaytable.jsp").forward(request, response);

        out.close();
    }
}
