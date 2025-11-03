public class Car {
    private String code;
    private Route route;
    private int maxPassengers;

    public Car() {
    }

    public Car(String code, Route route, int maxPassengers) {
        this.code = code;
        this.route = route;
        this.maxPassengers = maxPassengers;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
