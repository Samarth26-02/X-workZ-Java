
package Assesments9;

import com.sun.xml.internal.ws.wsdl.writer.document.PortType;

public class Port {
    private PortType portType;
    private int speed;

    public Port(){
        System.out.println("no-arg constructor");
    }
    public void setPortType(PortType portType){
        this.portType=portType;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void portDetails(){
        System.out.println("Port type:"+portType+"Speed:"+speed);
    }
}
