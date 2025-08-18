//assesment3

package Assesments3;
public class Cricket {
    Ticket ticket;
    Ticket buy;
    Ticket sell;
    Cricket(Ticket ticket){
        this.ticket=ticket;
    }
    public void watch(){
        if(buy!=null){
            ticket.buy();
        }else{
            System.out.println("You are out of money,You cant buy any more tickets..");
        }
    }

    public void profit(){
        if(sell!=null) {
            ticket.sell();
        }else{
            System.out.println("All tickets are sold,no more seats are empty..");
        }
    }
}
