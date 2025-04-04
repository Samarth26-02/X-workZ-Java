package Assesments10;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television=new Television();
        television.size();
        television.display();
        television.hdmiPorts();
        television.resolution();
        television.smartTV();
        System.out.println("---------------");
        Television television1=new TelevisionDetails();
        television1.size();
        television1.display();
        television1.smartTV();
        television1.resolution();
        television1.hdmiPorts();
        System.out.println("-------------");
        TelevisionDetails televisionDetails=new TelevisionDetails();
        televisionDetails.display();
        televisionDetails.size();
        televisionDetails.hdmiPorts();
        televisionDetails.smartTV();
        televisionDetails.resolution();
    }
}
