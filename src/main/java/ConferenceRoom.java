public class ConferenceRoom extends Room {

    String name;

    public ConferenceRoom(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
