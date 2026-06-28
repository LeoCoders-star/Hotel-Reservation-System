public class StandardRoom extends Room
{
    private final double basePrice = 120.0;
    private String bedType;

    // Normal Constructor
    public StandardRoom(String roomNumber, String roomType, int capacity, double pricePerNight, boolean availability, String bedType)
    {
        super(roomNumber, roomType, capacity, pricePerNight, availability);
        this.bedType = bedType;
    }

    // Setter
    public void setBedType(String bedType)
    {
        this.bedType = bedType;
    }

    // Getter
    public String getBedType()
    {
        return bedType;
    }

    // Processor
    public double calculatePrice()
    {
        return basePrice;
    }

    public String getRoomDetails()
    {
        return "Room Number      : " + getRoomNumber() +
               "\nRoom Type        : " + getRoomType() +
               "\nCapacity         : " + getCapacity() +
               "\nPrice Per Night  : RM " + getPricePerNight() +
               "\nAvailability     : " + checkAvailability() +
               "\nBed Type         : " + bedType;
    }
}