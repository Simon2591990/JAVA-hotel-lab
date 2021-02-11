import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }


    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }


    public void addGuestToBedroom(int roomNumber, Guest guest) {
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber) {
                bedroom.addGuest(guest);
            }
        }
    }

    public void addGuestToConferenceRoom(String roomName, Guest guest) {
        for (ConferenceRoom conferenceRoom : this.conferenceRooms){
            if (conferenceRoom.getName() == roomName){
                conferenceRoom.addGuest(guest);
            }
        }
    }
    public void removeGuestFromBedroom(int roomNumber, Guest guest) {
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getRoomNumber() == roomNumber) {
                bedroom.removeGuest(guest);
            }
        }
    }

    public void removeGuestFromConferenceRoom(String roomName, Guest guest) {
        for (ConferenceRoom conferenceRoom : this.conferenceRooms){
            if (conferenceRoom.getName() == roomName){
                conferenceRoom.removeGuest(guest);
            }
        }
    }
    public Booking bookRoom(Bedroom bedroom, int nights){
        return new Booking(bedroom, nights);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public ArrayList<Bedroom> getEmptyRooms() {
        ArrayList<Bedroom> emptyRooms = null;
        for (Bedroom bedroom : this.bedrooms){
            if (bedroom.getGuests().size() == 0){
                emptyRooms.add(bedroom);
            }
        }
        return emptyRooms; 
    }
}
