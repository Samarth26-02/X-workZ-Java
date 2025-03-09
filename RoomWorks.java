class RoomWorks{
    public static void main(String[] args) {
        Hotel.bookRoom();
        Hotel.provideRoomService();
        Hotel.checkInGuest();
        Hotel.arrangeEvents();
        Hotel.processPayment();

        Room.clean();
        Room.provideWiFi();
        Room.adjustTemperature();
        Room.turnOnTV();
        Room.lockDoor();
    }
}

class Room {
    public static void clean() { System.out.println("Cleaning the room..."); }
    public static void provideWiFi() { System.out.println("Providing WiFi access..."); }
    public static void adjustTemperature() { System.out.println("Adjusting room temperature..."); }
    public static void turnOnTV() { System.out.println("Turning on the TV..."); }
    public static void lockDoor() { System.out.println("Locking the room door..."); }
}