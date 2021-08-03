package fuelling;

import java.util.List;

public class RentCompany extends Company{
    private static List<Car> cars;

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String generateReport() {
        return null;
    }
}
