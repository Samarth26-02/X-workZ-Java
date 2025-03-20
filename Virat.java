public class Virat {
    Brush brush;
    Clip clip;
    Ticket ticket;
    Cricket cricket;

    Virat(Brush brush,Clip clip,Ticket ticket,Cricket cricket){
        this.brush=brush;
        this.clip=clip;
        this.ticket=ticket;
        this.cricket=cricket;
    }
    void play(){
        System.out.println("Virat is playing..");
        cricket.watch();
        cricket.profit();
    }
    void clean(){
        System.out.println("Virat is cleaning..");
        brush.clean();
        brush.scrub();
    }
    void relax(){
        System.out.println("Virat is relaxing..");
        ticket.buy();
        ticket.sell();
    }
}
