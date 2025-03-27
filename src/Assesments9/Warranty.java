package Assesments9;

public class Warranty {
    private String startDate;
    private String endDate;

    public Warranty(){

    }
    public void setStartDate(String startDate){
        this.startDate=startDate;
        startDate="21/03/2024";
    }
    public void setEndDate(String endDate){
        this.endDate=endDate;
        endDate="31/04/2028";
    }

    public void lampDetails(){
        System.out.println("Warranty start date:"+startDate+"End date:"+endDate);
    }
}
