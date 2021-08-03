package fuelling2;

import fuelling.Distance;
import fuelling.Mileage;
import fuelling.Name;

public class K5 implements Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(13);

    public K5(int distance) {
        this.name = new Name("K5");
        this.distance = new Distance(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return mileage.getValue();
    }

    @Override
    public double getTripDistance() {
        return distance.getValue();
    }

    @Override
    public String getName() {
        return name.getValue();
    }

}
