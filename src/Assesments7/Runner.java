package Assesments7;

public class Runner {
    public static void main(String[] args) {
        JailDetails jaildetails = new JailDetails();
        jaildetails.initJailDetails();

        SatelliteService satelliteService = new SatelliteService();
        satelliteService.initSatelliteLocally();

        IdCardService idCardService = new IdCardService();
        idCardService.initIdCardsLocally();

        AlienService alienService = new AlienService();
        alienService.initAliensLocally();

        CameraServices cameraService = new CameraServices();
        cameraService.initCameraLocally();
    }
}
