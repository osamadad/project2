public class NonSubscribedPassenger extends Passenger {
    Boolean haveDiscountCoupon;

    public NonSubscribedPassenger() {
    }

    public NonSubscribedPassenger(String name, String id, Car reservedCar, Boolean haveDiscountCoupon) {
        super(name, id);
        this.haveDiscountCoupon = haveDiscountCoupon;
        reserveCar(reservedCar);
    }

    @Override
    public void reserveCar(Car car) throws IllegalArgumentException {
        if (car.getMaxPassengers() <= 0) {
            throw new IllegalArgumentException("Car maximum passenger capacity can't be zero or less");
        }
        super.setReservedCar(car);
        double tripCost = super.getReservedCar().getRoute().getTripPrice();
        if (this.haveDiscountCoupon) {
            super.setTripCost(tripCost - (tripCost * 0.1));
        } else {
            super.setTripCost(tripCost);
        }

    }

    @Override
    public String toString() {
        if (this.haveDiscountCoupon) {
            return "Passenger name: " + super.getName() + " ID number: " + super.getId()
                    + " have reserved car " + super.getReservedCar().getCode() + " costing "
                    + super.getReservedCar().getRoute().getTripPrice() + " before the discount coupon, and: "
                    + super.getTripCost() + " after the discount";
        } else {
            return "Passenger name: " + super.getName() + " ID number: " + super.getId()
                    + " have reserved car " + super.getReservedCar().getCode() + " costing " + super.getTripCost();
        }
    }
}
