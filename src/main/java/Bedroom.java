public class Bedroom extends Room {

    int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
