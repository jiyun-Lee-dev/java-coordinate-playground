package fuelling;

public class Sonata extends Car {
    public Sonata(int mileage) {
        super();
    }

    @Override
    double getDistancePerLiter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}
