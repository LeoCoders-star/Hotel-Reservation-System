public class Room
{
    private String roomNumber;
    private String roomType;
    private int capacity;
    private double pricePerNight;
    private boolean availability;

    // Normal Constructor
    public Room(String roomNumber, String roomType, int capacity, double pricePerNight, boolean availability)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
    }

    // Setter
    public void setRoomNumber(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void setPricePerNight(double pricePerNight)
    {
        this.pricePerNight = pricePerNight;
    }

    public void setRoomAvailability(boolean availability)
    {
        this.availability = availability;
    }

    // Getter
    public String getRoomNumber()
    {
        return roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public double getPricePerNight()
    {
        return pricePerNight;
    }

    public boolean checkAvailability()
    {
        return availability;
    }
}