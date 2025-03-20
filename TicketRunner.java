public class TicketRunner {
    public static void main(String[] args){
        Ticket ticket=new Ticket(TicketType1.VIP,500);

        Cricket cricket=new Cricket(ticket);

        cricket.watch();
        cricket.profit();
    }
}