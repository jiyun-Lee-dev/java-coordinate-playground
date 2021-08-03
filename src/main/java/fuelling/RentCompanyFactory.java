package fuelling;

public class RentCompanyFactory extends CompanyFactory {
    @Override
    public RentCompany create() {
        return new RentCompany();
    }
}
