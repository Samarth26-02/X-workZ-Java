public class MainRunner {
    public static void main(String[] args){
        Brush brush=new Brush(Color.BLUE);
        Clip clip=new Clip("RED");
        Ticket ticket=new Ticket(TicketType1.VIP,500);
        Cricket cricket=new Cricket(ticket);
        Virat virat=new Virat(brush,clip,ticket,cricket);

        virat.play();
        virat.clean();
        virat.relax();
    }
}
