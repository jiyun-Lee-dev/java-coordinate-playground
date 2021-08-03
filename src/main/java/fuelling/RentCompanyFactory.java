package fuelling;

public class RentCompanyFactory extends CompanyFactory {
    @Override
    RentCompany create() {
        return new RentCompany();
    }
}
