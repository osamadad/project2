import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            Route route1 = new Route("Manarat street", "Sultanah street", 70);
            Route route2 = new Route("Tuwaiq academy", "Narjis neighbourhood", 60);
            Route route3 = new Route("Riyadh", "Medinah", 600);

            Car car1 = new Car("123456789", route1, 0);                 /* will trigger the exception  */
            Car car2 = new Car("987654321", route2, 5);
            Car car3 = new Car("159753486", route1, 9);
            Car car4 = new Car("135798642", route3, 2);

            ArrayList<Passenger> passengers = new ArrayList<>();

            //SubscribedPassenger subscribedPassenger = new SubscribedPassenger("Osama", "001", car1);
            SubscribedPassenger subscribedPassenger = new SubscribedPassenger("Osama", "001", car4);
            System.out.println("Do you have a discount coupon? (true or false)");
            Boolean haveDiscount = input.nextBoolean();
            NonSubscribedPassenger nonSubscribedPassenger = new NonSubscribedPassenger("Mohammed", "002", car2, haveDiscount);
            passengers.add(subscribedPassenger);
            passengers.add(nonSubscribedPassenger);

            subscribedPassenger.reserveCar(car3);
            nonSubscribedPassenger.reserveCar(car4);


            for (Passenger passenger : passengers) {
                System.out.println(passenger);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter true or false");
        }

    }
}