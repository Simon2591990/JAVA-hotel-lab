public class Bedroom extends Room {

    private int roomNumber;
    private double rate;

    public Bedroom(RoomType roomType, int roomNumber, double rate) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRate() {
        return rate;
    }
}
