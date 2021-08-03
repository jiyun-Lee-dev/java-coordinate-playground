package fuelling;

public class RentCompanyFactory extends Factory {
    @Override
    public RentCompany create() {
        return new RentCompany();
    }
}
