package Assesments9;

public class Runner {
    public static void main(String[] args) {
        Projector projector=new Projector();
        projector.projectorDetails();

        projector.lamp.setType("Metal");
        projector.lamp.setWarranty(new Warranty());

        projector.lens.setFocalLength("Concave");
        projector.lens.setMaterial("Glass");

        //projector.port.setPortType(new PortType());
        projector.port.setSpeed(20);

        projector.wire.setQuality(new Quality());
        projector.wire.setLength(20.0);

        projector.board.setCapacitor(new Capacitor());
        projector.board.setLayers(3);

        //projector.button.setMaterial(new Material());
        projector.button.setNoOfButtons(2);

        projector.panel.setType("Fiber");
        projector.panel.setResolution(4);

        projector.screw.setMaterial("Metal");
        projector.screw.setSize(4);

        projector.lamp.lampInfo();
        projector.lens.lenDetails();
        projector.port.portDetails();
        projector.wire.wireDetails();
        projector.board.boardDetails();
        projector.button.buttonDetails();
        projector.panel.panelDetails();
        projector.screw.screwDetails();
    }
}
