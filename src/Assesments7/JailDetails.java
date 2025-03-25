package Assesments7;

public class JailDetails {
    public void processJail(Jail jail){
        System.out.println("Processing jail..");
        System.out.println("Jail name:"+jail.getName());
        System.out.println("Jail location:"+jail.getLocation());
        System.out.println("Jailer name:"+jail.getJailerName());
        System.out.println("Total cells:"+jail.getTotalCell());
        System.out.println("-------------");
    }
    public void initJailDetails() {
        Jail jail = new Jail();
        jail.setName("Central jail");
        jail.setLocation("New york");
        jail.setJailerName("Alex");
        jail.setTotalCell(10);
        processJail(jail);
    }
}
