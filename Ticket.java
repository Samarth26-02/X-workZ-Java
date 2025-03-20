public class Ticket {
    TicketType1 type;
    double cost;

    Ticket(TicketType1 type, double cost){
        this.type=type;
        this.cost=cost;
    }
    public void buy(){
        System.out.println("Buy a "+type+" of ticket for RS."+cost);
    }

    public void sell(){
        System.out.println("Sold a"+type+" of ticket to RS."+cost);
    }
}
