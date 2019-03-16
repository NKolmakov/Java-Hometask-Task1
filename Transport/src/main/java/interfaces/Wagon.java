package interfaces;

public interface Wagon {
    void addPassenger(int passengers);

    void removePassenger(int passengers);

    void addLuggage(int luggage);

    void removeLuggage(int luggage);

    int getLuggageCapacity();

    int getNumber();

    int getAmountOfSeats();

    int getAmountOfPassengers();

     int getAmountOfLuggage();

     int getConvenience();

     String getType();

     void setNumber(int number);

     void setAmountOfLuggage(int amountOfLuggage);

     void setAmountOfPassengers(int amountOfPassengers);

}
