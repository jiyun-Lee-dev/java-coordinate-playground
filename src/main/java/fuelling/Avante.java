package fuelling;

public class Avante extends Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(15);

    public Avante(int distance) {
        this.name = new Name("Avante");
        this.distance = new Distance(distance);
    }

    @Override
    double getDistancePerLiter() {
        return mileage.getValue();
    }

    @Override
    double getTripDistance() {
        return distance.getValue();
    }

    @Override
    String getName() {
        return name.getValue();
    }
}
