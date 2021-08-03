package fuelling;

public class K5 extends Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(13);

    public K5(int distance) {
        this.name = new Name("K5");
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
