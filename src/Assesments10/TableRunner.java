package Assesments10;

public class TableRunner {
    public static void main(String[] args) {
        Table table=new Table();
        table.shape();
        table.material();
        table.length();
        table.legsNo();
        table.use();
        System.out.println("--------------");
        Table table1=new TableDetails();
        table1.shape();
        table1.material();
        table1.length();
        table1.legsNo();
        table1.use();
        System.out.println("-------------");
        TableDetails tableDetails=new TableDetails();
        tableDetails.legsNo();
        tableDetails.length();
        tableDetails.use();
        tableDetails.shape();
        tableDetails.material();
    }
}
