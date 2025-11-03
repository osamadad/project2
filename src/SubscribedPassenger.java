import java.util.InputMismatchException;

public class SubscribedPassenger extends Passenger {

    public SubscribedPassenger() {
    }

    public SubscribedPassenger(String name, String id, Car reservedCar) {
        super(name, id);
        reserveCar(reservedCar);
    }

    @Override
    public void reserveCar(Car car) throws IllegalArgumentException {

        if (car.getMaxPassengers() <= 0) {
            throw new IllegalArgumentException("Car maximum passenger capacity can't be zero or less");
        }
        super.setReservedCar(car);
        super.setTripCost(car.getRoute().getTripPrice() * 0.5);

    }

    @Override
    public String toString() {
        return "Passenger name: " + super.getName() + " ID number: " + super.getId()
                + " have reserved car " + super.getReservedCar().getCode() + " costing "
                + super.getReservedCar().getRoute().getTripPrice() + " before the subscribers discount, and: "
                + super.getTripCost() + " after the discount";
    }
}
