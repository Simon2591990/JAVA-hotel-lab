public class DiningRoom extends Room {

    private String name;
    private int capacity;

    public DiningRoom(RoomType roomType, String name, int capacity) {
        super(roomType);
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
