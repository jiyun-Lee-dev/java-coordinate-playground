package fuelling2;

public class RentCompanyFactory implements CompanyFactory{
    public RentCompany create() {
        return new RentCompany();
    };
}
