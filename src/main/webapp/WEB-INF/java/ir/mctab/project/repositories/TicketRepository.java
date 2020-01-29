package ir.mctab.project.repositories;

import ir.mctab.project.config.repositories.CrudRepository;
import ir.mctab.project.entities.Ticket;


public class TicketRepository extends CrudRepository<Ticket, Long> {

    public static TicketRepository getInstance() {
        return new TicketRepository();
    }

    @Override
    protected Class<Ticket> getEntityClass() {
        return Ticket.class;
    }
}