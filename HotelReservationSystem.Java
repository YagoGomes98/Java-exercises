import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    static class Hotel {
        String name;
        int roomsAvailable;

        Hotel(String name, int roomsAvailable) {
            this.name = name;
            this.roomsAvailable = roomsAvailable;
        }

        public void bookRoom() {
            if (roomsAvailable > 0) {
                roomsAvailable--;
                System.out.println("Room booked at " + name);
            } else {
                System.out.println("No rooms available at " + name);
            }
        }
    }

    Map<String, Hotel> hotels = new HashMap<>();

    public void addHotel(String name, int roomsAvailable) {
        hotels.put(name, new Hotel(name, roomsAvailable));
    }

    public void bookRoom(String hotelName) {
        Hotel hotel = hotels.get(hotelName);
        if (hotel != null) {
            hotel.bookRoom();
        } else {
            System.out.println("Hotel not found");
        }
    }

    public static void main(String[] args) {
        HotelReservationSystem system = new HotelReservationSystem();
        system.addHotel("Hilton", 10);
        system.addHotel("Marriott", 5);

        system.bookRoom("Hilton");  // Room booked at Hilton
        system.bookRoom("Hilton");  // Room booked at Hilton
        system.bookRoom("Marriott"); // Room booked at Marriott
        system.bookRoom("Hilton");  // Room booked at Hilton
        system.bookRoom("Holiday Inn"); // Hotel not found
    }
}
