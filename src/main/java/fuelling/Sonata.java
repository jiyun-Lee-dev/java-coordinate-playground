package fuelling;

public class Sonata extends Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(10);

    public Sonata(int distance) {
        this.name = new Name("Sonata");
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
