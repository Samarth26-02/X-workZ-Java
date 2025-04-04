package Assesments10;

public class DeviceDetails extends Device {
    @Override
    public void powerOn(){
        System.out.println("Power On");
    }
    @Override
    public void powerOff(){
        System.out.println("Power Off");
    }
    @Override
    public void model(){
        System.out.println("Model of device");
    }
    @Override
    public void price(){
        System.out.println("Price of device");
    }
    @Override
    public void brand(){
        System.out.println("Brand of device");
    }
}
